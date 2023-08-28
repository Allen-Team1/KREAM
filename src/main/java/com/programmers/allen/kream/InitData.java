package com.programmers.allen.kream;



import com.programmers.allen.kream.domain.brand.Brand;
import com.programmers.allen.kream.domain.goods.Goods;
import com.programmers.allen.kream.domain.goods.Product;
import com.programmers.allen.kream.domain.goods.ProductInfo;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Component
public class InitData {

    private final InnerInit innerInit;

    public InitData(InnerInit innerInit) {
        this.innerInit = innerInit;
    }

    @PostConstruct
    public void init() {
        innerInit.save();
        innerInit.load();
    }

    @Component
    public static class InnerInit {

        private final EntityManager entityManager;

        public InnerInit(EntityManager entityManager) {
            this.entityManager = entityManager;
        }

        @Transactional
        public void save() {
            Brand brand = new Brand("NIKE");
            entityManager.persist(brand);

            Goods goods_220 = new Goods("250");
            Goods goods_225 = new Goods("225");

            ProductInfo productInfo = new ProductInfo("BLK-AL23", LocalDate.now(), "BLACK", "23/12/05");
            Product product = new Product(brand.getId(), "productA", productInfo, List.of(goods_220, goods_225));

            entityManager.persist(product);
        }

        @Transactional(readOnly = true)
        public void load() {
            Product product = entityManager.find(Product.class, 1L);

            List<Goods> goods = product.getGoods();
            for (Goods good : goods) {
                System.out.println(good.toString());
            }
        }
    }
}

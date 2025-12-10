package creational.builder.amazon_orders;

import java.security.PublicKey;
import java.time.LocalDate;

/*
public class Order {

    private String orderId;
    private String customerId;
    private String orderItems;
    private String shippingAddress;
    private String billingAddress;
    private String paymentMethod;
    private double totalAmount;

    // Optional parameters
    private String discountCode;             // Optional
    private boolean giftWrap;                // Optional
    private String customerNotes;            // Optional
    private LocalDate preferredDeliveryDate;

    public Order(OrderBuilder orderBuilder) {
        this.orderId = orderBuilder.orderId;
        this.customerId = orderBuilder.customerId;
        this.orderItems = orderBuilder.orderItems;
        this.shippingAddress = orderBuilder.shippingAddress;
        this.billingAddress = orderBuilder.billingAddress;
        this.paymentMethod = orderBuilder.paymentMethod;
        this.totalAmount = orderBuilder.totalAmount;
        this.discountCode = orderBuilder.discountCode;
        this.giftWrap = orderBuilder.giftWrap;
        this.customerNotes = orderBuilder.customerNotes;
        this.preferredDeliveryDate = orderBuilder.preferredDeliveryDate;
    }

    */
/*public static class OrderBuilder {


        private String orderId;
        private String customerId;
        private String orderItems;
        private String shippingAddress;
        private String billingAddress;
        private String paymentMethod;
        private double totalAmount;

        // Optional parameters
        private String discountCode;             // Optional
        private boolean giftWrap;                // Optional
        private String customerNotes;            // Optional
        private LocalDate preferredDeliveryDate;

        public OrderBuilder(String orderId, double totalAmount, String paymentMethod, String billingAddress, String shippingAddress, String orderItems, String customerId) {
            this.orderId = orderId;
            this.totalAmount = totalAmount;
            this.paymentMethod = paymentMethod;
            this.billingAddress = billingAddress;
            this.shippingAddress = shippingAddress;
            this.orderItems = orderItems;
            this.customerId = customerId;
        }

        // Static builder access method
        public static OrderBuilder builder() {
            return new OrderBuilder();
        }*//*


        public static class OrderBuilder {

            private String orderId;
            private String customerId;
            private String orderItems;
            private String shippingAddress;
            private String billingAddress;
            private String paymentMethod;
            private double totalAmount;

            // Optional parameters
            private String discountCode;
            private boolean giftWrap;
            private String customerNotes;
            private LocalDate preferredDeliveryDate;

            // Setter-style builder methods (method chaining)
            public OrderBuilder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public OrderBuilder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            public OrderBuilder orderItems(String orderItems) {
                this.orderItems = orderItems;
                return this;
            }

            public OrderBuilder shippingAddress(String shippingAddress) {
                this.shippingAddress = shippingAddress;
                return this;
            }

            public OrderBuilder billingAddress(String billingAddress) {
                this.billingAddress = billingAddress;
                return this;
            }

            public OrderBuilder paymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            public OrderBuilder totalAmount(double totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            public OrderBuilder discountCode(String discountCode) {
                this.discountCode = discountCode;
                return this;
            }

            public OrderBuilder giftWrap(boolean giftWrap) {
                this.giftWrap = giftWrap;
                return this;
            }

            public OrderBuilder customerNotes(String customerNotes) {
                this.customerNotes = customerNotes;
                return this;
            }

            public OrderBuilder preferredDeliveryDate(LocalDate preferredDeliveryDate) {
                this.preferredDeliveryDate = preferredDeliveryDate;
                return this;
            }

            // Build method
            public Order build() {
                return new OrderBuilder().build();
            }
        }
    }
}
*/

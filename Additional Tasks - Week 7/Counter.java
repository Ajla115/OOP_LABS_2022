package com.AdditionalTasksWeek7;

public class Counter {
        private int counter;

        public Counter() {
            this.reset();
        }

        public void incr1() {
            this.increment(1);
        }

        public void incr10() {
            this.increment(10);
        }

        public void incr100() {
            this.increment(100);
        }

        public void incr1000() {
            this.increment(1000);
        }

        private void increment(int toAdd) {
            if (this.overflow(toAdd)) {
                this.counter += toAdd;
                System.out.println("Counter: " + this.counter);
            } else System.out.println("Overflowing the counter! You must reset!");
        }

        private boolean overflow(int toAdd) {
            return this.counter + toAdd <= 9999;
        }

        public void reset() {
            this.counter = 0;
        }

}

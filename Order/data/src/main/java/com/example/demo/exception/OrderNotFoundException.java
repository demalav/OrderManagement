package com.example.demo.exception;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class OrderNotFoundException extends RuntimeException{

        private String message;
        private int statusCode;

        public OrderNotFoundException(String message, int statusCode) {
            this.message = message;
            this.statusCode = statusCode;
        }

        @Override
        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(int statusCode) {
            this.statusCode = statusCode;
        }

    }
}

package com.workrc.common.request;

public class RequestEntity<T> {
   private T content;

   public T getContent() {
      return content;
   }

   public void setContent(T content) {
      this.content = content;
   }
}

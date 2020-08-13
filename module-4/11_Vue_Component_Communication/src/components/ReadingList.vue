<template>
  <div class="book-container">
    <book-card
    v-for="book in bookList" 
    v-bind:key="book.id" v-bind:book='book'/>
  </div>
</template>

<script>
import BookCard from './BookCard';

export default {
  name: "reading-list",
  components: {
    BookCard
  },
  data() {
      return {
          bookList
      }
  },
  computed: {
      bookList() {
          return this.$store.state.books;
      }
  }
};
</script>

<style>
.book-container {
  display: flex;
  justify-content: space-evenly;
  flex-wrap: wrap;
}
</style>
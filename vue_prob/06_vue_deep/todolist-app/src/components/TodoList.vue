<template>
  <div class="row">
    <div class="col">
      <ul class="list-group">
<<<<<<< HEAD
        <TodoListItem v-for="todoItem in todoList" :key="todoItem.id" :todoItem="todoItem"/>
=======
        <TodoListItem v-for="todoItem in todoList" :key="todoItem.id" :todoItem="todoItem" />
>>>>>>> origin/main
      </ul>
    </div>
  </div>
</template>

<script>
<<<<<<< HEAD
import TodoListItem from './TodoListItem.vue';

export default {
  name: 'TodoList', // 각각 InputTodo , TodoList , TodoListItem
components:{TodoListItem},
props:{
  todoList:{type:Array, required:true},
},
};
=======
import TodoListItem from './TodoListItem.vue'

export default {
  name: 'TodoList', // 각각 InputTodo , TodoList , TodoListItem
  components: { TodoListItem },
  data() {
    return {
      todoList: [],
    }
  },
}
>>>>>>> origin/main
</script>

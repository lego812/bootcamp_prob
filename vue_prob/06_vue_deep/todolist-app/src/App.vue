<template>
  <div id="app" class="container">
    <div class="card card body bg light">
      <div class="title">:: Todolist App</div>
    </div>
    <div class="card card default card borderless">
      <div class="card body">
        <InputTodo @add-todo="addTodo" />
        <TodoList
          @todoList="todoList"
          @delete-todo="deleteTodo"
          @toggle-completed="toggleCompleted"
        />
      </div>
    </div>
  </div>
</template>

<script>
import TodoList from './components/ TodoList.vue'
import InputTodo from './components/ InputTodo.vue'

let ts = new Date().getTime()

export default {
  name: 'App',
  components: { InputTodo, TodoList }, // 각각 InputTodo , TodoList , TodoListItem
  data() {
    return {
      TodoList: [
        { id: ts, todo: '자전거 타기', completed: false },
        { id: ts + 1, todo: '자전거 타기', completed: false },
        { id: ts + 2, todo: '자전거 타기', completed: false },
        { id: ts + 3, todo: '자전거 타기', completed: false },
      ],
    }
  },
}
</script>

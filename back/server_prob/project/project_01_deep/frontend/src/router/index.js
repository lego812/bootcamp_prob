import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '@/pages/HomePage.vue'
import AuthRoutes from './auth'
import BoardRoutes from './board'
import travelRoutes from './travel'
import galleryRoutes from './gallery'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage,
    },
    ...AuthRoutes,
    ...BoardRoutes,
    ...travelRoutes,
    ...galleryRoutes
  ],
})

export default router
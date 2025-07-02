import { createRouter, createWebHistory } from 'vue-router'
import HomePage from '../pages/HomePage.vue'
import authRouters from './auth';
import boardRouters from './board';
import galleryRouters from './gallery';
import travelRouters from './travel';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomePage,
    },
    ...authRouters,
    ...boardRouters,
    ...galleryRouters,
    ...travelRouters,
  ],
})

export default router

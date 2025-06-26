export default [
  {
    path: '/auth/login',
    name: 'login',
    component:()=>import('../pages/auth/LoginPage.vue')
  },
  {
    path: '/auth/join',
    name: 'join',
    component:()=>import('../pages/auth/JoinPage.vue')
  },
  {
    path: '/auth/changePasswordPage',
    name: 'changePasswordPage',
    component:()=>import('../pages/auth/changePasswordPage.vue')
  },
  {
    path: '/auth/ProfilePage',
    name: 'ProfilePage',
    component:()=>import('../pages/auth/ProfilePage.vue')
  }
]
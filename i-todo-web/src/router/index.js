import { createRouter,createWebHistory } from "vue-router";

const routes = [
    {
        path:'/',
        component:()=>import("@/views/Home")
    },
    {
        path: '/user',
        component:()=>import("@/views/user/user")
    }
]

const router = createRouter({
    history:createWebHistory(),
    routes
})

export default router

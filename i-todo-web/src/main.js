import { createApp } from 'vue'
import App from './App.vue'

import ElementPlus from 'element-plus'
import 'element-plus/theme-chalk/index.css'

import router from './router/index'

import api from './api'
const app = createApp(App)
app.use(ElementPlus)
app.use(router)
app.config.globalProperties.$api = api
app.mount('#app')


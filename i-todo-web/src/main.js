import { createApp } from 'vue'
import App from './App.vue'

import ElementPlus from 'element-plus'
import 'element-plus/theme-chalk/index.css'

import router from './router/index'

import vue3videoPlay from "vue3-video-play"
import "vue3-video-play/dist/style.css"
const app = createApp(App)

app.use(ElementPlus)
app.use(router)
app.use(vue3videoPlay)
app.mount('#app')


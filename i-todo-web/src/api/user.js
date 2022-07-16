import request from "@/utils/request";

export function getUserList(params={}) {
    request({
        method:"GET",
        url:"/user/getList",
        params
    })
}

import request from '@/utils/request'

// 查询订单列表
export function listOrder(query) {
  return request({
    url: '/mall/order/list',
    method: 'get',
    params: query
  })
}


// 查询订单详细(查询)
export function getOrderListAll(id) {
  return request({
    url: '/mall/order/' + id,
    method: 'get'
  })
}

// 查询订单详细(修改的时候)
export function getOrder(id) {
  return request({
    url: '/mall/order/' + id,
    method: 'get'
  })
}

// 新增订单
export function addOrder(data) {
  return request({
    url: '/mall/order',
    method: 'post',
    data: data
  })
}

// 修改订单
export function updateOrder(data) {
  return request({
    url: '/mall/order',
    method: 'put',
    data: data
  })
}

// 删除订单
export function delOrder(id) {
  return request({
    url: '/mall/order/' + id,
    method: 'delete'
  })
}

// 彻底删除用户
export function completeDelOrder(id) {
  return request({
    url: '/mall/order/complete' + id,
    method: 'delete'
  })
}

// 导出订单
export function exportOrder(query) {
  return request({
    url: '/mall/order/export',
    method: 'get',
    params: query
  })
}
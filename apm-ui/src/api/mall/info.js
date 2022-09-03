import request from '@/utils/request'

// 查询订单购物详情列表
export function listInfo(query) {
  return request({
    url: '/mall/info/list',
    method: 'get',
    params: query
  })
}

// 查询订单购物详情详细
export function getInfo(id) {
  return request({
    url: '/mall/info/' + id,
    method: 'get'
  })
}

// 新增订单购物详情
export function addInfo(data) {
  return request({
    url: '/mall/info',
    method: 'post',
    data: data
  })
}

// 修改订单购物详情
export function updateInfo(data) {
  return request({
    url: '/mall/info',
    method: 'put',
    data: data
  })
}

// 删除订单购物详情
export function delInfo(id) {
  return request({
    url: '/mall/info/' + id,
    method: 'delete'
  })
}

// 导出订单购物详情
export function exportInfo(query) {
  return request({
    url: '/mall/info/export',
    method: 'get',
    params: query
  })
}
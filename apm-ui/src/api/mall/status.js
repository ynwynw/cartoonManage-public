import request from '@/utils/request'

// 查询订单操作记录列表
export function listStatus(query) {
  return request({
    url: '/mall/status/list',
    method: 'get',
    params: query
  })
}

// 查询订单操作记录详细
export function getStatus(id) {
  return request({
    url: '/mall/status/' + id,
    method: 'get'
  })
}

// 新增订单操作记录
export function addStatus(data) {
  return request({
    url: '/mall/status',
    method: 'post',
    data: data
  })
}

// 修改订单操作记录
export function updateStatus(data) {
  return request({
    url: '/mall/status',
    method: 'put',
    data: data
  })
}

// 删除订单操作记录
export function delStatus(id) {
  return request({
    url: '/mall/status/' + id,
    method: 'delete'
  })
}

// 导出订单操作记录
export function exportStatus(query) {
  return request({
    url: '/mall/status/export',
    method: 'get',
    params: query
  })
}
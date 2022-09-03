import request from '@/utils/request'

// 查询商品属性列表
export function listAttr(query) {
  return request({
    url: '/mall/attr/list',
    method: 'get',
    params: query
  })
}

// 查询商品属性详细
export function getAttr(id) {
  return request({
    url: '/mall/attr/' + id,
    method: 'get'
  })
}

// 新增商品属性
export function addAttr(data) {
  return request({
    url: '/mall/attr',
    method: 'post',
    data: data
  })
}

// 修改商品属性
export function updateAttr(data) {
  return request({
    url: '/mall/attr',
    method: 'put',
    data: data
  })
}

// 删除商品属性
export function delAttr(id) {
  return request({
    url: '/mall/attr/' + id,
    method: 'delete'
  })
}

// 导出商品属性
export function exportAttr(query) {
  return request({
    url: '/mall/attr/export',
    method: 'get',
    params: query
  })
}
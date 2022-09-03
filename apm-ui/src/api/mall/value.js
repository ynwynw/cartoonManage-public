import request from '@/utils/request'

// 查询属性组合列表
export function listValue(query) {
  return request({
    url: '/mall/value/list',
    method: 'get',
    params: query
  })
}

// 查询属性组合详细
export function getValue(id) {
  return request({
    url: '/mall/value/' + id,
    method: 'get'
  })
}

// 新增属性组合
export function addValue(data) {
  return request({
    url: '/mall/value',
    method: 'post',
    data: data
  })
}

// 修改属性组合
export function updateValue(data) {
  return request({
    url: '/mall/value',
    method: 'put',
    data: data
  })
}

// 删除属性组合
export function delValue(id) {
  return request({
    url: '/mall/value/' + id,
    method: 'delete'
  })
}

// 导出属性组合
export function exportValue(query) {
  return request({
    url: '/mall/value/export',
    method: 'get',
    params: query
  })
}
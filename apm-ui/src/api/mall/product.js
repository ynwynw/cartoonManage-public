import request from '@/utils/request'

// 查询商品列表
export function listProduct(query) {
  return request({
    url: '/mall/product/list',
    method: 'get',
    params: query
  })
}

// 查询商品详细
export function getProduct(id) {
  return request({
    url: '/mall/product/' + id,
    method: 'get'
  })
}

// 新增商品
export function addProduct(data) {
  return request({
    url: '/mall/product',
    method: 'post',
    data: data
  })
}

// 修改商品
export function updateProduct(data) {
  return request({
    url: '/mall/product',
    method: 'put',
    data: data
  })
}

// 删除商品
export function delProduct(id) {
  return request({
    url: '/mall/product/' + id,
    method: 'delete'
  })
}

// 用户头像上传
export function imageUpload(data) {
  return request({
    url: '/mall/product/web/image',
    method: 'post',
    data: data
  })
}

// 导出商品
export function exportProduct(query) {
  return request({
    url: '/mall/product/export',
    method: 'get',
    params: query
  })
}
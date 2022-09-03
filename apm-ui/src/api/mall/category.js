import request from '@/utils/request'

// 查询商品分类列表
export function listCategory(query) {
  return request({
    url: '/mall/category/list',
    method: 'get',
    params: query
  })
}

// 查询商品分类详细
export function getCategory(id) {
  return request({
    url: '/mall/category/' + id,
    method: 'get'
  })
}

// 查询部门下拉树结构
export function treeselect() {
  return request({
    url: '/mall/category/treeList',
    method: 'get'
  })
}

// 查询部门二级分类列表
export function secondList() {
  return request({
    url: '/mall/category/secondList',
    method: 'get'
  })
}

// 新增商品分类
export function addCategory(data) {
  return request({
    url: '/mall/category',
    method: 'post',
    data: data
  })
}

// 修改商品分类
export function updateCategory(data) {
  return request({
    url: '/mall/category',
    method: 'put',
    data: data
  })
}

// 删除商品分类
export function delCategory(id) {
  return request({
    url: '/mall/category/' + id,
    method: 'delete'
  })
}

// 导出商品分类
export function exportCategory(query) {
  return request({
    url: '/mall/category/export',
    method: 'get',
    params: query
  })
}
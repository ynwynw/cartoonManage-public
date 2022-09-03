import request from '@/utils/request'

// 查询文件管理列表
export function listFile(query) {
  return request({
    url: '/system/file/list',
    method: 'get',
    params: query
  })
}

// 查询文件管理详细
export function getFile(id) {
  return request({
    url: '/system/file/' + id,
    method: 'get'
  })
}

// 新增文件管理
export function addFile(data) {
  return request({
    url: '/system/file',
    method: 'post',
    data: data
  })
}

// 修改文件管理
export function updateFile(data) {
  return request({
    url: '/system/file',
    method: 'put',
    data: data
  })
}

// 删除文件管理
export function delFile(id) {
  return request({
    url: '/system/file/' + id,
    method: 'delete'
  })
}

// 导出文件管理
export function exportFile(query) {
  return request({
    url: '/system/file/export',
    method: 'get',
    params: query
  })
}
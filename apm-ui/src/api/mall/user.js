import request from '@/utils/request'

// 查询用户列表
export function listUser(query) {
  return request({
    url: '/mall/user/list',
    method: 'get',
    params: query
  })
}

// 查询用户详细
export function getUser(userId) {
  return request({
    url: '/mall/user/' + userId,
    method: 'get'
  })
}

// 新增用户
export function addUser(data) {
  return request({
    url: '/mall/user',
    method: 'post',
    data: data
  })
}

// 修改用户
export function updateUser(data) {
  return request({
    url: '/mall/user',
    method: 'put',
    data: data
  })
}

// 逻辑删除用户
export function delUser(userId) {
  return request({
    url: '/mall/user/' + userId,
    method: 'delete'
  })
}

// 彻底删除用户
export function completeDelUser(userId) {
  return request({
    url: '/mall/user/complete' + userId,
    method: 'delete'
  })
}

// 用户密码重置
export function resetUserPwd(userId, password) {
  const data = {
    userId,
    password
  }
  return request({
    url: '/mall/user/resetPwd',
    method: 'put',
    data: data
  })
}

// 导出用户
export function exportUser(query) {
  return request({
    url: '/mall/user/export',
    method: 'get',
    params: query
  })
}

// 用户状态修改
export function changeUserStatus(userId, status) {
  const data = {
    userId,
    status
  }
  return request({
    url: '/mall/user/changeStatus',
    method: 'put',
    data: data
  })
}
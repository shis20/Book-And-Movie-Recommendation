// pages/posts/posts.js
import {local_database} from '../../data/data.js'
console.log(local_database)
Page({

    /**
     * 页面的初始数据
     */
    data: {
       
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        // wx.setStorageSync('flag', true)
        // wx.setStorageSync('flag', false)
        // wx.setStorageSync('flag1', true)
        // wx.removeStorageSync('flag')  清除指定缓存
        // wx.clearStorageSync()  清空所有缓存
        // const flag_result = wx.getStorageSync('flag1')  得到缓存
        // console.log(flag_result)
        // const flag = wx.getStorage({
        //     key:'flag',
        //     success(value){
        //         console.log(value.data)
        //     }
        // })
        // flag.then((value)=>{
        //     console.log(value)
        // })
        this.setData({
            local_database
        })
        console.log("onload");
        
    },    

    onGoToDetail(event){
        console.log(event)
        const pid = event.currentTarget.dataset.id
        wx.navigateTo({
            url:'/pages/postdetail/postdetail?pid='+pid
        })
        console.log("onGoToDetail");
    },
    /**
     * 生命周期函数--监听页面初次渲染完成
     */
    onReady: function () {

    },

    /**
     * 生命周期函数--监听页面显示
     */
    onShow: function () {

    },

    /**
     * 生命周期函数--监听页面隐藏
     */
    onHide: function () {

    },

    /**
     * 生命周期函数--监听页面卸载
     */
    onUnload: function () {

    },

    /**
     * 页面相关事件处理函数--监听用户下拉动作
     */
    onPullDownRefresh: function () {

    },

    /**
     * 页面上拉触底事件的处理函数
     */
    onReachBottom: function () {

    },

    /**
     * 用户点击右上角分享
     */
    onShareAppMessage: function () {

    }
})
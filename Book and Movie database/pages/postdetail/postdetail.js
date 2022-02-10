// pages/postdetail/postdetail.js
import {local_database} from '../../data/data.js'
const app = getApp()
console.log(local_database)
Page({

    /**
     * 页面的初始数据
     */
    data: {
        postData:{},
        _pid:null,
        collected:false,
        _postsCollected:{},
        isPlaying:false
    },

    /**
     * 生命周期函数--监听页面加载
     */
    onLoad: function (options) {
        const postData = local_database[options.pid]
        this.data._pid = options.pid
        const postsCollected = wx.getStorageSync('posts_collected')
        console.log(postsCollected)
        
        if(postsCollected){
          this.data._postsCollected = postsCollected
        }
        
        let collected = postsCollected[this.data._pid]
    
        if(collected === undefined){
          // 如果undefined 说明文章从来没有被收藏过
          collected = false
        }
    
        this.setData({
          postData,
          collected,
          isPlaying:app.gIsPlayingMusic 
        })
    },  
    onMusic(event){
      const manager = wx.getBackgroundAudioManager()
      manager.src=local_database[0].music.url
      manager.title = local_database[0].music.title
      manager.coverImgUrl = local_database[0].music.coverImg
      app.gIsPlayingMusic = true
      this.setData({
        isPlaying:true
      })
    },
    stopMusic(event){
      const manager = wx.getBackgroundAudioManager()
      manager.stop()
      app.gIsPlayingMusic = false
      this.setData({
        isPlaying:false
      })
    },
    async onShare(event){
        const result = await wx.showActionSheet({
          itemList: ['分享到微信','分享到朋友圈']
        })
        console.log(result)
          
    },    
    async saveAsFavo(event){
        //假设未收藏  --> 收藏
        //多篇文章被收藏
        const postsCollected = this.data._postsCollected
        wx.getStorageSync('key')
        postsCollected[this.data._pid] = !this.data.collected
        this.setData({
          collected:!this.data.collected
        })
    
        wx.setStorageSync('posts_collected',postsCollected)
        wx.showToast({
            title: this.data.collected?'收藏成功':'取消收藏',
            duration:2000
        })
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
<template>
  <div class="container">
    <el-card class="login_box" style="text-align: center" body-style="padding: '53px'">
      <div class="login_tag" style="display: flex; justify-content: center;align-items: center;">
        <el-button type="text" :style="{ color: activeButton? '#4fa5d9' : '#505050', fontSize: '18px' }"
                   @click="activeButton=true">登录
        </el-button>
        <el-divider direction="vertical"></el-divider>
        <el-button type="text" :style="{ color: !activeButton ? '#4fa5d9' : '#505050', fontSize: '18px' }"
                   @click="activeButton=false">注册
        </el-button>
      </div>
        <el-form :model="form" :rules="rules" ref="form" class="login_form" v-if="activeButton">
          <el-form-item prop="email">
            <el-input v-model="form.email" placeholder="请输入邮箱地址" clearable></el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input v-model="form.password" placeholder="请输入登录密码" show-password clearable></el-input>
          </el-form-item>
          <!--        <div style="margin-top: -15px;font-size: 14px;">-->
          <!--        <span style=" display: flex; align-items: center;">没有账户？<el-button type="text" style="color: #0067b8;">创建一个！</el-button></span>-->
          <!--        <div style="display: flex;">-->
          <!--          <el-button type="text" style="color: #0067b8;">找回密码-->
          <!--          </el-button>-->
          <!--        </div>-->

          <!--        </div>-->
          <el-form-item>
            <el-button type="primary" style="width: 100%" @click="login">登录</el-button>
          </el-form-item>

        </el-form>

    </el-card>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
  background-color: #ddddff; /* 页面背景颜色 */
}

.login_box {
  min-width: 400px;
  max-width: 450px;
  background-color: rgba(255, 255, 255, 0.75);
  border-radius: 5px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* 给登录框添加阴影效果 */
  position: absolute;
  margin: 0;
  top: 45%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 25%;
  height: 40%;
}

.login_form {
  margin: 30px auto 0;
  width: 80%;
}

.login_form.el-form-item {
  margin-bottom: 15px;
}


.login_form.el-input input {
  border: 1px solid #ddd; /* 输入框边框样式 */
  border-radius: 3px;
  padding: 10px;
}

.login_form.el-button {
  border: none;
  border-radius: 3px;
  padding: 10px 20px;
}


/*.container {*/
/*  background-color: grey;*/
/*  margin: 0;*/
/*  height: 100%;*/
/*  padding:0;*/
/*  line-height: 50%;*/
/*}*/
/*.login_box{*/
/*  !*position: absolute;*!*/
/*  margin: 0;*/
/*  position: absolute;*/
/*  top: 45%;*/
/*  left: 50%;*/
/*  transform: translate(-50%, -50%);*/
/*  width: 25%;*/
/*  height: 40%;*/
/*}*/
</style>

<script>
export default {
  name: "login",
  data() {
    return {
      activeButton: true,//登录和注册标识符
      form: {
        email: '',
        password: '',
      },
      rules: {
        email: [
          {required: true, message: '请输入邮箱地址', trigger: 'blur'},
          {type: 'email', message: '请输入正确的邮箱地址', trigger: 'blur'}
        ], password: [
          {required: true, message: '请输入密码', trigger: 'blur'}, {
            min: 6,
            message: '密码长度至少6个字符',
            trigger: 'blur'
          }
        ]
      }
    }
  }
  , created() {

  },
  methods: {
    login() {
      this.$refs.form.validate(valid => {
        console.log(this.form)
        // 验证结果 valid
        if (valid) {
          //调接口 发请求  params 直接通过this.form 自动发送
          this.$http.get('/user/login', {params: this.form}).then(res => {
            //res 返回的响应信息，包含了url、header、 data后台的响应数据
            let result = res.data
            if (result.code === 200) {
              this.$message.success(result.msg)
              // localStorage.setItem('userInfo', JSON.stringify(result.data))
              // this.$router.push("/")
            } else {
              this.$message.error(result.msg)
            }
          })
        }
      })
    }
  }
}
</script>
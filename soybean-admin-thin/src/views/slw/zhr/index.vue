<template>
	<div style="padding: 0%;margin: 0%">
		<n-data-table :columns="columns" :data="tableData" />
	</div>
</template>

<script lang="ts">
import axios from "axios";
const createColumns = () =>{
	return [
		{
			title: 'id',
			key: "id"
		},
		{
			title: '姓名',
			key: 'name'
		},
		{
			title: '学号',
			key: 'student_id'
		},
		{
			title: '手机号',
			key: 'phone'
		},
		{
			title: '邮箱',
			key: 'email'
		},
		{
			title: '密码',
			key: 'password'
		},
		{
			title: '身份证号',
			key: 'identity_card'
		},
		{
			title: '信用评分',
			key: 'credit_score'
		}
	]
};
export default {
	data() {
		return {
			columns: createColumns(),
			tableData:[{}]
		};
	},
	created() {
		axios.get('/url-pattern/userSelect').then(resp => {
			this.tableData=resp.data;
		});
	}
};


</script>

<style scoped>

</style>

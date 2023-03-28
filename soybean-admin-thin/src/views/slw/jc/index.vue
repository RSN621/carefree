<template>
	<div style="padding: 0%;margin: 0%">
		<n-data-table :columns="columns" :data="tableData" />
	</div>
</template>
<script lang="ts" setup>
import {ref,onMounted,watchEffect} from "vue";
import axios from 'axios';
const createColumns = () => {
	return [
		{
			title: 'id',
			key: 'id',
		},
		{
			title: '姓名',
			key: 'name',
		},
		{
			title: '学号',
			key: 'student_id',
		},
		{
			title: '手机号',
			key: 'phone',
		},
		{
			title: '邮箱',
			key: 'email',
		},
		{
			title: '密码',
			key: 'password',
		},
		{
			title: '身份证号',
			key: 'identity_card',
		},
		{
			title: '信用评分',
			key: 'credit_score',
		},
	];
};
const tableData = ref([]);
const columns = ref(createColumns());
onMounted(() => {
	axios.get('/url-pattern/userSelect').then((resp) => {
		tableData.value = resp.data;
	});
});
watchEffect(() => {
	if (tableData.value.length > 0) {
		// do something with the data
		tableData.value.sort((a, b) => a.id - b.id);
	}
});
</script>

<style scoped>

</style>

const merchantDropdown = document.getElementById('merchant');

const themeDropdown = document.getElementById('theme');

const getThemesByMerchantCode = (merchantCode) => {
    return axios.get(`/api/merchant/${merchantCode}`);
}

merchantDropdown.addEventListener('change', () => {
    getThemesByMerchantCode(merchantDropdown.value).then((res) => {
        const { data } = res;
        const getThemes = data.map((theme) => {
           return `<option value="${theme.themeCode}">${theme.themeName}</option>`;
        });
        themeDropdown.innerHTML = getThemes;
    });
});

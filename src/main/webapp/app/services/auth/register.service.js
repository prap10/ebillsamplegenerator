(function () {
    'use strict';

    angular
        .module('ebillsamplegeneratorApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();

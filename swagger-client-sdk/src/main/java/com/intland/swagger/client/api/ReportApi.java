/*
 * codeBeamer swagger API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.intland.swagger.client.api;

import com.intland.swagger.client.ApiCallback;
import com.intland.swagger.client.ApiClient;
import com.intland.swagger.client.ApiException;
import com.intland.swagger.client.ApiResponse;
import com.intland.swagger.client.Configuration;
import com.intland.swagger.client.Pair;
import com.intland.swagger.client.ProgressRequestBody;
import com.intland.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.intland.swagger.client.model.ReportItemResult;
import com.intland.swagger.client.model.ReportResult;
import com.intland.swagger.client.model.SimpleReportSettings;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportApi {
    private ApiClient localVarApiClient;

    public ReportApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createReport
     * @param simpleReportSettings  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createReportCall(SimpleReportSettings simpleReportSettings, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = simpleReportSettings;

        // create path and map variables
        String localVarPath = "/v3/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createReportValidateBeforeCall(SimpleReportSettings simpleReportSettings, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = createReportCall(simpleReportSettings, _callback);
        return localVarCall;

    }

    /**
     * Create a report
     * 
     * @param simpleReportSettings  (optional)
     * @return SimpleReportSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public SimpleReportSettings createReport(SimpleReportSettings simpleReportSettings) throws ApiException {
        ApiResponse<SimpleReportSettings> localVarResp = createReportWithHttpInfo(simpleReportSettings);
        return localVarResp.getData();
    }

    /**
     * Create a report
     * 
     * @param simpleReportSettings  (optional)
     * @return ApiResponse&lt;SimpleReportSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SimpleReportSettings> createReportWithHttpInfo(SimpleReportSettings simpleReportSettings) throws ApiException {
        okhttp3.Call localVarCall = createReportValidateBeforeCall(simpleReportSettings, null);
        Type localVarReturnType = new TypeToken<SimpleReportSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a report (asynchronously)
     * 
     * @param simpleReportSettings  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createReportAsync(SimpleReportSettings simpleReportSettings, final ApiCallback<SimpleReportSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = createReportValidateBeforeCall(simpleReportSettings, _callback);
        Type localVarReturnType = new TypeToken<SimpleReportSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReportById
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report content by id </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportByIdCall(Integer reportId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/reports/{reportId}/results"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReportByIdValidateBeforeCall(Integer reportId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getReportById(Async)");
        }
        

        okhttp3.Call localVarCall = getReportByIdCall(reportId, page, pageSize, _callback);
        return localVarCall;

    }

    /**
     * Get a report results by id of the report
     * 
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @return ReportResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report content by id </td><td>  -  </td></tr>
     </table>
     */
    public ReportResult getReportById(Integer reportId, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<ReportResult> localVarResp = getReportByIdWithHttpInfo(reportId, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * Get a report results by id of the report
     * 
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @return ApiResponse&lt;ReportResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report content by id </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportResult> getReportByIdWithHttpInfo(Integer reportId, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getReportByIdValidateBeforeCall(reportId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ReportResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a report results by id of the report (asynchronously)
     * 
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report content by id </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportByIdAsync(Integer reportId, Integer page, Integer pageSize, final ApiCallback<ReportResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportByIdValidateBeforeCall(reportId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ReportResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getReportItemsById
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report items by id </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportItemsByIdCall(Integer reportId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/reports/{reportId}/items"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReportItemsByIdValidateBeforeCall(Integer reportId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling getReportItemsById(Async)");
        }
        

        okhttp3.Call localVarCall = getReportItemsByIdCall(reportId, page, pageSize, _callback);
        return localVarCall;

    }

    /**
     * Get a report items by id of the report
     * 
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @return ReportItemResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report items by id </td><td>  -  </td></tr>
     </table>
     */
    public ReportItemResult getReportItemsById(Integer reportId, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<ReportItemResult> localVarResp = getReportItemsByIdWithHttpInfo(reportId, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * Get a report items by id of the report
     * 
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @return ApiResponse&lt;ReportItemResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report items by id </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportItemResult> getReportItemsByIdWithHttpInfo(Integer reportId, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = getReportItemsByIdValidateBeforeCall(reportId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ReportItemResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a report items by id of the report (asynchronously)
     * 
     * @param reportId Id of a report (required)
     * @param page Index of a report page starting from 1. (optional, default to 1)
     * @param pageSize Number of items a report page. Max value: 500 (optional, default to 25)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Report not found </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Report items by id </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getReportItemsByIdAsync(Integer reportId, Integer page, Integer pageSize, final ApiCallback<ReportItemResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = getReportItemsByIdValidateBeforeCall(reportId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ReportItemResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateReport
     * @param reportId Id of a report (required)
     * @param simpleReportSettings  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Updated report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateReportCall(Integer reportId, SimpleReportSettings simpleReportSettings, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = simpleReportSettings;

        // create path and map variables
        String localVarPath = "/v3/reports/{reportId}"
            .replaceAll("\\{" + "reportId" + "\\}", localVarApiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth", "BasicAuth", "BearerAuth" };
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateReportValidateBeforeCall(Integer reportId, SimpleReportSettings simpleReportSettings, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
            throw new ApiException("Missing the required parameter 'reportId' when calling updateReport(Async)");
        }
        

        okhttp3.Call localVarCall = updateReportCall(reportId, simpleReportSettings, _callback);
        return localVarCall;

    }

    /**
     * Update report settings
     * 
     * @param reportId Id of a report (required)
     * @param simpleReportSettings  (optional)
     * @return SimpleReportSettings
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Updated report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public SimpleReportSettings updateReport(Integer reportId, SimpleReportSettings simpleReportSettings) throws ApiException {
        ApiResponse<SimpleReportSettings> localVarResp = updateReportWithHttpInfo(reportId, simpleReportSettings);
        return localVarResp.getData();
    }

    /**
     * Update report settings
     * 
     * @param reportId Id of a report (required)
     * @param simpleReportSettings  (optional)
     * @return ApiResponse&lt;SimpleReportSettings&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Updated report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SimpleReportSettings> updateReportWithHttpInfo(Integer reportId, SimpleReportSettings simpleReportSettings) throws ApiException {
        okhttp3.Call localVarCall = updateReportValidateBeforeCall(reportId, simpleReportSettings, null);
        Type localVarReturnType = new TypeToken<SimpleReportSettings>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update report settings (asynchronously)
     * 
     * @param reportId Id of a report (required)
     * @param simpleReportSettings  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 403 </td><td> Authentication is required </td><td>  -  </td></tr>
        <tr><td> 200 </td><td> Updated report settings </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateReportAsync(Integer reportId, SimpleReportSettings simpleReportSettings, final ApiCallback<SimpleReportSettings> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateReportValidateBeforeCall(reportId, simpleReportSettings, _callback);
        Type localVarReturnType = new TypeToken<SimpleReportSettings>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

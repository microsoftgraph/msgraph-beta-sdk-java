package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Request for assignment filter evaluation for devices. */
public class AssignmentFilterEvaluateRequest implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The OdataType property */
    private String _odataType;
    /** Order the devices should be sorted in. Default is ascending on device name. */
    private java.util.List<String> _orderBy;
    /** Supported platform types. */
    private DevicePlatformType _platform;
    /** Rule definition of the Assignment Filter. */
    private String _rule;
    /** Search keyword applied to scope found devices. */
    private String _search;
    /** Number of records to skip. Default value is 0 */
    private Integer _skip;
    /** Limit of records per request. Default value is 100, if provided less than 0 or greater than 100 */
    private Integer _top;
    /**
     * Instantiates a new assignmentFilterEvaluateRequest and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AssignmentFilterEvaluateRequest() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignmentFilterEvaluateRequest
     */
    @javax.annotation.Nonnull
    public static AssignmentFilterEvaluateRequest createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignmentFilterEvaluateRequest();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(7);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("orderBy", (n) -> { this.setOrderBy(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getEnumValue(DevicePlatformType.class)); });
        deserializerMap.put("rule", (n) -> { this.setRule(n.getStringValue()); });
        deserializerMap.put("search", (n) -> { this.setSearch(n.getStringValue()); });
        deserializerMap.put("skip", (n) -> { this.setSkip(n.getIntegerValue()); });
        deserializerMap.put("top", (n) -> { this.setTop(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the orderBy property value. Order the devices should be sorted in. Default is ascending on device name.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getOrderBy() {
        return this._orderBy;
    }
    /**
     * Gets the platform property value. Supported platform types.
     * @return a devicePlatformType
     */
    @javax.annotation.Nullable
    public DevicePlatformType getPlatform() {
        return this._platform;
    }
    /**
     * Gets the rule property value. Rule definition of the Assignment Filter.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRule() {
        return this._rule;
    }
    /**
     * Gets the search property value. Search keyword applied to scope found devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSearch() {
        return this._search;
    }
    /**
     * Gets the skip property value. Number of records to skip. Default value is 0
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getSkip() {
        return this._skip;
    }
    /**
     * Gets the top property value. Limit of records per request. Default value is 100, if provided less than 0 or greater than 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTop() {
        return this._top;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("orderBy", this.getOrderBy());
        writer.writeEnumValue("platform", this.getPlatform());
        writer.writeStringValue("rule", this.getRule());
        writer.writeStringValue("search", this.getSearch());
        writer.writeIntegerValue("skip", this.getSkip());
        writer.writeIntegerValue("top", this.getTop());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the orderBy property value. Order the devices should be sorted in. Default is ascending on device name.
     * @param value Value to set for the orderBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrderBy(@javax.annotation.Nullable final java.util.List<String> value) {
        this._orderBy = value;
    }
    /**
     * Sets the platform property value. Supported platform types.
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final DevicePlatformType value) {
        this._platform = value;
    }
    /**
     * Sets the rule property value. Rule definition of the Assignment Filter.
     * @param value Value to set for the rule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRule(@javax.annotation.Nullable final String value) {
        this._rule = value;
    }
    /**
     * Sets the search property value. Search keyword applied to scope found devices.
     * @param value Value to set for the search property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSearch(@javax.annotation.Nullable final String value) {
        this._search = value;
    }
    /**
     * Sets the skip property value. Number of records to skip. Default value is 0
     * @param value Value to set for the skip property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkip(@javax.annotation.Nullable final Integer value) {
        this._skip = value;
    }
    /**
     * Sets the top property value. Limit of records per request. Default value is 100, if provided less than 0 or greater than 100
     * @param value Value to set for the top property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTop(@javax.annotation.Nullable final Integer value) {
        this._top = value;
    }
}

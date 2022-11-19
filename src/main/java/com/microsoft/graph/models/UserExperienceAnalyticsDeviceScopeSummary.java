package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics tenant level information for all the device scope configurations */
public class UserExperienceAnalyticsDeviceScopeSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** A collection of the user experience analytics device scope Unique Identifiers that are enabled and finished recalculating the report metric. */
    private java.util.List<String> _completedDeviceScopeIds;
    /** A collection of user experience analytics device scope Unique Identitfiers that are enabled but there is insufficient data to calculate results. */
    private java.util.List<String> _insufficientDataDeviceScopeIds;
    /** The OdataType property */
    private String _odataType;
    /** The total number of user experience analytics device scopes. Valid values -2147483648 to 2147483647 */
    private Integer _totalDeviceScopes;
    /** The total number of user experience analytics device scopes that are enabled. Valid values -2147483648 to 2147483647 */
    private Integer _totalDeviceScopesEnabled;
    /**
     * Instantiates a new userExperienceAnalyticsDeviceScopeSummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceScopeSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.userExperienceAnalyticsDeviceScopeSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsDeviceScopeSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceScopeSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceScopeSummary();
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
     * Gets the completedDeviceScopeIds property value. A collection of the user experience analytics device scope Unique Identifiers that are enabled and finished recalculating the report metric.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCompletedDeviceScopeIds() {
        return this._completedDeviceScopeIds;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsDeviceScopeSummary currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(5);
        deserializerMap.put("completedDeviceScopeIds", (n) -> { currentObject.setCompletedDeviceScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("insufficientDataDeviceScopeIds", (n) -> { currentObject.setInsufficientDataDeviceScopeIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("totalDeviceScopes", (n) -> { currentObject.setTotalDeviceScopes(n.getIntegerValue()); });
        deserializerMap.put("totalDeviceScopesEnabled", (n) -> { currentObject.setTotalDeviceScopesEnabled(n.getIntegerValue()); });
        return deserializerMap
    }
    /**
     * Gets the insufficientDataDeviceScopeIds property value. A collection of user experience analytics device scope Unique Identitfiers that are enabled but there is insufficient data to calculate results.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getInsufficientDataDeviceScopeIds() {
        return this._insufficientDataDeviceScopeIds;
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
     * Gets the totalDeviceScopes property value. The total number of user experience analytics device scopes. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalDeviceScopes() {
        return this._totalDeviceScopes;
    }
    /**
     * Gets the totalDeviceScopesEnabled property value. The total number of user experience analytics device scopes that are enabled. Valid values -2147483648 to 2147483647
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalDeviceScopesEnabled() {
        return this._totalDeviceScopesEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("completedDeviceScopeIds", this.getCompletedDeviceScopeIds());
        writer.writeCollectionOfPrimitiveValues("insufficientDataDeviceScopeIds", this.getInsufficientDataDeviceScopeIds());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("totalDeviceScopes", this.getTotalDeviceScopes());
        writer.writeIntegerValue("totalDeviceScopesEnabled", this.getTotalDeviceScopesEnabled());
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
     * Sets the completedDeviceScopeIds property value. A collection of the user experience analytics device scope Unique Identifiers that are enabled and finished recalculating the report metric.
     * @param value Value to set for the completedDeviceScopeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletedDeviceScopeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._completedDeviceScopeIds = value;
    }
    /**
     * Sets the insufficientDataDeviceScopeIds property value. A collection of user experience analytics device scope Unique Identitfiers that are enabled but there is insufficient data to calculate results.
     * @param value Value to set for the insufficientDataDeviceScopeIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInsufficientDataDeviceScopeIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._insufficientDataDeviceScopeIds = value;
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
     * Sets the totalDeviceScopes property value. The total number of user experience analytics device scopes. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceScopes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalDeviceScopes(@javax.annotation.Nullable final Integer value) {
        this._totalDeviceScopes = value;
    }
    /**
     * Sets the totalDeviceScopesEnabled property value. The total number of user experience analytics device scopes that are enabled. Valid values -2147483648 to 2147483647
     * @param value Value to set for the totalDeviceScopesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalDeviceScopesEnabled(@javax.annotation.Nullable final Integer value) {
        this._totalDeviceScopesEnabled = value;
    }
}

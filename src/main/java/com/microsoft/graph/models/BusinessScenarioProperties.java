package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BusinessScenarioProperties implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The identifier for the bucketDefinition configured in the plannerPlanConfiguration for the scenario. The task will be placed in the corresponding plannerBucket in the target plan. Required.
     */
    private String externalBucketId;
    /**
     * The identifier for the context of the task. Context is an application controlled value, and tasks can be queried by their externalContextId. Optional.
     */
    private String externalContextId;
    /**
     * Application-specific identifier for the task. Every task for the same scenario must have a unique identifier specified for this property. Required.
     */
    private String externalObjectId;
    /**
     * Application-specific version of the task. Optional.
     */
    private String externalObjectVersion;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The URL to the application-specific experience for this task. Optional.
     */
    private String webUrl;
    /**
     * Instantiates a new BusinessScenarioProperties and sets the default values.
     */
    public BusinessScenarioProperties() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BusinessScenarioProperties
     */
    @jakarta.annotation.Nonnull
    public static BusinessScenarioProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessScenarioProperties();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the externalBucketId property value. The identifier for the bucketDefinition configured in the plannerPlanConfiguration for the scenario. The task will be placed in the corresponding plannerBucket in the target plan. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalBucketId() {
        return this.externalBucketId;
    }
    /**
     * Gets the externalContextId property value. The identifier for the context of the task. Context is an application controlled value, and tasks can be queried by their externalContextId. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalContextId() {
        return this.externalContextId;
    }
    /**
     * Gets the externalObjectId property value. Application-specific identifier for the task. Every task for the same scenario must have a unique identifier specified for this property. Required.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalObjectId() {
        return this.externalObjectId;
    }
    /**
     * Gets the externalObjectVersion property value. Application-specific version of the task. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalObjectVersion() {
        return this.externalObjectVersion;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("externalBucketId", (n) -> { this.setExternalBucketId(n.getStringValue()); });
        deserializerMap.put("externalContextId", (n) -> { this.setExternalContextId(n.getStringValue()); });
        deserializerMap.put("externalObjectId", (n) -> { this.setExternalObjectId(n.getStringValue()); });
        deserializerMap.put("externalObjectVersion", (n) -> { this.setExternalObjectVersion(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the webUrl property value. The URL to the application-specific experience for this task. Optional.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.webUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("externalBucketId", this.getExternalBucketId());
        writer.writeStringValue("externalContextId", this.getExternalContextId());
        writer.writeStringValue("externalObjectId", this.getExternalObjectId());
        writer.writeStringValue("externalObjectVersion", this.getExternalObjectVersion());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("webUrl", this.getWebUrl());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the externalBucketId property value. The identifier for the bucketDefinition configured in the plannerPlanConfiguration for the scenario. The task will be placed in the corresponding plannerBucket in the target plan. Required.
     * @param value Value to set for the externalBucketId property.
     */
    public void setExternalBucketId(@jakarta.annotation.Nullable final String value) {
        this.externalBucketId = value;
    }
    /**
     * Sets the externalContextId property value. The identifier for the context of the task. Context is an application controlled value, and tasks can be queried by their externalContextId. Optional.
     * @param value Value to set for the externalContextId property.
     */
    public void setExternalContextId(@jakarta.annotation.Nullable final String value) {
        this.externalContextId = value;
    }
    /**
     * Sets the externalObjectId property value. Application-specific identifier for the task. Every task for the same scenario must have a unique identifier specified for this property. Required.
     * @param value Value to set for the externalObjectId property.
     */
    public void setExternalObjectId(@jakarta.annotation.Nullable final String value) {
        this.externalObjectId = value;
    }
    /**
     * Sets the externalObjectVersion property value. Application-specific version of the task. Optional.
     * @param value Value to set for the externalObjectVersion property.
     */
    public void setExternalObjectVersion(@jakarta.annotation.Nullable final String value) {
        this.externalObjectVersion = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the webUrl property value. The URL to the application-specific experience for this task. Optional.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.webUrl = value;
    }
}

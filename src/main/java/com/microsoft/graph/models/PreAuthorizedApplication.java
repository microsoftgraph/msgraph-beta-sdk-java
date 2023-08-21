package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PreAuthorizedApplication implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The unique identifier for the client application.
     */
    private String appId;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The unique identifier for the scopes the client application is granted.
     */
    private java.util.List<String> permissionIds;
    /**
     * Instantiates a new preAuthorizedApplication and sets the default values.
     */
    public PreAuthorizedApplication() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a preAuthorizedApplication
     */
    @jakarta.annotation.Nonnull
    public static PreAuthorizedApplication createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PreAuthorizedApplication();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the appId property value. The unique identifier for the client application.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.appId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("permissionIds", (n) -> { this.setPermissionIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the permissionIds property value. The unique identifier for the scopes the client application is granted.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPermissionIds() {
        return this.permissionIds;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfPrimitiveValues("permissionIds", this.getPermissionIds());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the appId property value. The unique identifier for the client application.
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.appId = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the permissionIds property value. The unique identifier for the scopes the client application is granted.
     * @param value Value to set for the permissionIds property.
     */
    public void setPermissionIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.permissionIds = value;
    }
}

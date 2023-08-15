package com.microsoft.graph.devicemanagement.chromeosonboardingsettings.connect;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ConnectPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The ownerAccessToken property
     */
    private String ownerAccessToken;
    /**
     * The ownerUserPrincipalName property
     */
    private String ownerUserPrincipalName;
    /**
     * Instantiates a new connectPostRequestBody and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public ConnectPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a connectPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ConnectPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConnectPostRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("ownerAccessToken", (n) -> { this.setOwnerAccessToken(n.getStringValue()); });
        deserializerMap.put("ownerUserPrincipalName", (n) -> { this.setOwnerUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ownerAccessToken property value. The ownerAccessToken property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOwnerAccessToken() {
        return this.ownerAccessToken;
    }
    /**
     * Gets the ownerUserPrincipalName property value. The ownerUserPrincipalName property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOwnerUserPrincipalName() {
        return this.ownerUserPrincipalName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("ownerAccessToken", this.getOwnerAccessToken());
        writer.writeStringValue("ownerUserPrincipalName", this.getOwnerUserPrincipalName());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the ownerAccessToken property value. The ownerAccessToken property
     * @param value Value to set for the ownerAccessToken property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOwnerAccessToken(@jakarta.annotation.Nullable final String value) {
        this.ownerAccessToken = value;
    }
    /**
     * Sets the ownerUserPrincipalName property value. The ownerUserPrincipalName property
     * @param value Value to set for the ownerUserPrincipalName property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOwnerUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.ownerUserPrincipalName = value;
    }
}

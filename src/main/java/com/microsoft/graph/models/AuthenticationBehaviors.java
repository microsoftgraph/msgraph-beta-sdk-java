package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AuthenticationBehaviors implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The OdataType property */
    private String odataType;
    /** The removeUnverifiedEmailClaim property */
    private Boolean removeUnverifiedEmailClaim;
    /** The requireClientServicePrincipal property */
    private Boolean requireClientServicePrincipal;
    /**
     * Instantiates a new authenticationBehaviors and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AuthenticationBehaviors() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a authenticationBehaviors
     */
    @javax.annotation.Nonnull
    public static AuthenticationBehaviors createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationBehaviors();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("removeUnverifiedEmailClaim", (n) -> { this.setRemoveUnverifiedEmailClaim(n.getBooleanValue()); });
        deserializerMap.put("requireClientServicePrincipal", (n) -> { this.setRequireClientServicePrincipal(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the removeUnverifiedEmailClaim property value. The removeUnverifiedEmailClaim property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRemoveUnverifiedEmailClaim() {
        return this.removeUnverifiedEmailClaim;
    }
    /**
     * Gets the requireClientServicePrincipal property value. The requireClientServicePrincipal property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRequireClientServicePrincipal() {
        return this.requireClientServicePrincipal;
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
        writer.writeBooleanValue("removeUnverifiedEmailClaim", this.getRemoveUnverifiedEmailClaim());
        writer.writeBooleanValue("requireClientServicePrincipal", this.getRequireClientServicePrincipal());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the removeUnverifiedEmailClaim property value. The removeUnverifiedEmailClaim property
     * @param value Value to set for the removeUnverifiedEmailClaim property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemoveUnverifiedEmailClaim(@javax.annotation.Nullable final Boolean value) {
        this.removeUnverifiedEmailClaim = value;
    }
    /**
     * Sets the requireClientServicePrincipal property value. The requireClientServicePrincipal property
     * @param value Value to set for the requireClientServicePrincipal property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRequireClientServicePrincipal(@javax.annotation.Nullable final Boolean value) {
        this.requireClientServicePrincipal = value;
    }
}

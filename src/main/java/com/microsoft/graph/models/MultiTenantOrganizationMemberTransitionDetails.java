package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MultiTenantOrganizationMemberTransitionDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The desiredRole property
     */
    private MultiTenantOrganizationMemberRole desiredRole;
    /**
     * The desiredState property
     */
    private MultiTenantOrganizationMemberState desiredState;
    /**
     * The details property
     */
    private String details;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The status property
     */
    private MultiTenantOrganizationMemberProcessingStatus status;
    /**
     * Instantiates a new multiTenantOrganizationMemberTransitionDetails and sets the default values.
     */
    public MultiTenantOrganizationMemberTransitionDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganizationMemberTransitionDetails
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationMemberTransitionDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationMemberTransitionDetails();
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
     * Gets the desiredRole property value. The desiredRole property
     * @return a multiTenantOrganizationMemberRole
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberRole getDesiredRole() {
        return this.desiredRole;
    }
    /**
     * Gets the desiredState property value. The desiredState property
     * @return a multiTenantOrganizationMemberState
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getDesiredState() {
        return this.desiredState;
    }
    /**
     * Gets the details property value. The details property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDetails() {
        return this.details;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("desiredRole", (n) -> { this.setDesiredRole(n.getEnumValue(MultiTenantOrganizationMemberRole.class)); });
        deserializerMap.put("desiredState", (n) -> { this.setDesiredState(n.getEnumValue(MultiTenantOrganizationMemberState.class)); });
        deserializerMap.put("details", (n) -> { this.setDetails(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(MultiTenantOrganizationMemberProcessingStatus.class)); });
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
     * Gets the status property value. The status property
     * @return a multiTenantOrganizationMemberProcessingStatus
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberProcessingStatus getStatus() {
        return this.status;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("desiredRole", this.getDesiredRole());
        writer.writeEnumValue("desiredState", this.getDesiredState());
        writer.writeStringValue("details", this.getDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the desiredRole property value. The desiredRole property
     * @param value Value to set for the desiredRole property.
     */
    public void setDesiredRole(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberRole value) {
        this.desiredRole = value;
    }
    /**
     * Sets the desiredState property value. The desiredState property
     * @param value Value to set for the desiredState property.
     */
    public void setDesiredState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.desiredState = value;
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.details = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberProcessingStatus value) {
        this.status = value;
    }
}

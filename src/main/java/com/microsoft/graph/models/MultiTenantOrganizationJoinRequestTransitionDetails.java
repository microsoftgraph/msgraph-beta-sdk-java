package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MultiTenantOrganizationJoinRequestTransitionDetails implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The desiredMemberState property
     */
    private MultiTenantOrganizationMemberState desiredMemberState;
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
     * Instantiates a new multiTenantOrganizationJoinRequestTransitionDetails and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationJoinRequestTransitionDetails() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a multiTenantOrganizationJoinRequestTransitionDetails
     */
    @jakarta.annotation.Nonnull
    public static MultiTenantOrganizationJoinRequestTransitionDetails createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MultiTenantOrganizationJoinRequestTransitionDetails();
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
     * Gets the desiredMemberState property value. The desiredMemberState property
     * @return a multiTenantOrganizationMemberState
     */
    @jakarta.annotation.Nullable
    public MultiTenantOrganizationMemberState getDesiredMemberState() {
        return this.desiredMemberState;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("desiredMemberState", (n) -> { this.setDesiredMemberState(n.getEnumValue(MultiTenantOrganizationMemberState.class)); });
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
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("desiredMemberState", this.getDesiredMemberState());
        writer.writeStringValue("details", this.getDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("status", this.getStatus());
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
     * Sets the desiredMemberState property value. The desiredMemberState property
     * @param value Value to set for the desiredMemberState property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDesiredMemberState(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberState value) {
        this.desiredMemberState = value;
    }
    /**
     * Sets the details property value. The details property
     * @param value Value to set for the details property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDetails(@jakarta.annotation.Nullable final String value) {
        this.details = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setStatus(@jakarta.annotation.Nullable final MultiTenantOrganizationMemberProcessingStatus value) {
        this.status = value;
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ServicePrincipalCreationConditionSet extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ServicePrincipalCreationConditionSet} and sets the default values.
     */
    public ServicePrincipalCreationConditionSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ServicePrincipalCreationConditionSet}
     */
    @jakarta.annotation.Nonnull
    public static ServicePrincipalCreationConditionSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalCreationConditionSet();
    }
    /**
     * Gets the applicationIds property value. The applicationIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicationIds() {
        return this.backingStore.get("applicationIds");
    }
    /**
     * Gets the applicationPublisherIds property value. The applicationPublisherIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicationPublisherIds() {
        return this.backingStore.get("applicationPublisherIds");
    }
    /**
     * Gets the applicationsFromVerifiedPublisherOnly property value. The applicationsFromVerifiedPublisherOnly property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getApplicationsFromVerifiedPublisherOnly() {
        return this.backingStore.get("applicationsFromVerifiedPublisherOnly");
    }
    /**
     * Gets the applicationTenantIds property value. The applicationTenantIds property
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getApplicationTenantIds() {
        return this.backingStore.get("applicationTenantIds");
    }
    /**
     * Gets the certifiedApplicationsOnly property value. The certifiedApplicationsOnly property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getCertifiedApplicationsOnly() {
        return this.backingStore.get("certifiedApplicationsOnly");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicationIds", (n) -> { this.setApplicationIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("applicationPublisherIds", (n) -> { this.setApplicationPublisherIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("applicationsFromVerifiedPublisherOnly", (n) -> { this.setApplicationsFromVerifiedPublisherOnly(n.getBooleanValue()); });
        deserializerMap.put("applicationTenantIds", (n) -> { this.setApplicationTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("certifiedApplicationsOnly", (n) -> { this.setCertifiedApplicationsOnly(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("applicationIds", this.getApplicationIds());
        writer.writeCollectionOfPrimitiveValues("applicationPublisherIds", this.getApplicationPublisherIds());
        writer.writeBooleanValue("applicationsFromVerifiedPublisherOnly", this.getApplicationsFromVerifiedPublisherOnly());
        writer.writeCollectionOfPrimitiveValues("applicationTenantIds", this.getApplicationTenantIds());
        writer.writeBooleanValue("certifiedApplicationsOnly", this.getCertifiedApplicationsOnly());
    }
    /**
     * Sets the applicationIds property value. The applicationIds property
     * @param value Value to set for the applicationIds property.
     */
    public void setApplicationIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("applicationIds", value);
    }
    /**
     * Sets the applicationPublisherIds property value. The applicationPublisherIds property
     * @param value Value to set for the applicationPublisherIds property.
     */
    public void setApplicationPublisherIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("applicationPublisherIds", value);
    }
    /**
     * Sets the applicationsFromVerifiedPublisherOnly property value. The applicationsFromVerifiedPublisherOnly property
     * @param value Value to set for the applicationsFromVerifiedPublisherOnly property.
     */
    public void setApplicationsFromVerifiedPublisherOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("applicationsFromVerifiedPublisherOnly", value);
    }
    /**
     * Sets the applicationTenantIds property value. The applicationTenantIds property
     * @param value Value to set for the applicationTenantIds property.
     */
    public void setApplicationTenantIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("applicationTenantIds", value);
    }
    /**
     * Sets the certifiedApplicationsOnly property value. The certifiedApplicationsOnly property
     * @param value Value to set for the certifiedApplicationsOnly property.
     */
    public void setCertifiedApplicationsOnly(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("certifiedApplicationsOnly", value);
    }
}

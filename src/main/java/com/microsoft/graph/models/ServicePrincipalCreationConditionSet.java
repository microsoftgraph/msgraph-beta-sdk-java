package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ServicePrincipalCreationConditionSet extends Entity implements Parsable {
    /** The applicationIds property */
    private java.util.List<String> applicationIds;
    /** The applicationPublisherIds property */
    private java.util.List<String> applicationPublisherIds;
    /** The applicationsFromVerifiedPublisherOnly property */
    private Boolean applicationsFromVerifiedPublisherOnly;
    /** The applicationTenantIds property */
    private java.util.List<String> applicationTenantIds;
    /** The certifiedApplicationsOnly property */
    private Boolean certifiedApplicationsOnly;
    /**
     * Instantiates a new servicePrincipalCreationConditionSet and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ServicePrincipalCreationConditionSet() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a servicePrincipalCreationConditionSet
     */
    @javax.annotation.Nonnull
    public static ServicePrincipalCreationConditionSet createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ServicePrincipalCreationConditionSet();
    }
    /**
     * Gets the applicationIds property value. The applicationIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }
    /**
     * Gets the applicationPublisherIds property value. The applicationPublisherIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApplicationPublisherIds() {
        return this.applicationPublisherIds;
    }
    /**
     * Gets the applicationsFromVerifiedPublisherOnly property value. The applicationsFromVerifiedPublisherOnly property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationsFromVerifiedPublisherOnly() {
        return this.applicationsFromVerifiedPublisherOnly;
    }
    /**
     * Gets the applicationTenantIds property value. The applicationTenantIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApplicationTenantIds() {
        return this.applicationTenantIds;
    }
    /**
     * Gets the certifiedApplicationsOnly property value. The certifiedApplicationsOnly property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertifiedApplicationsOnly() {
        return this.certifiedApplicationsOnly;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.applicationIds = value;
    }
    /**
     * Sets the applicationPublisherIds property value. The applicationPublisherIds property
     * @param value Value to set for the applicationPublisherIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationPublisherIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.applicationPublisherIds = value;
    }
    /**
     * Sets the applicationsFromVerifiedPublisherOnly property value. The applicationsFromVerifiedPublisherOnly property
     * @param value Value to set for the applicationsFromVerifiedPublisherOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationsFromVerifiedPublisherOnly(@javax.annotation.Nullable final Boolean value) {
        this.applicationsFromVerifiedPublisherOnly = value;
    }
    /**
     * Sets the applicationTenantIds property value. The applicationTenantIds property
     * @param value Value to set for the applicationTenantIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationTenantIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.applicationTenantIds = value;
    }
    /**
     * Sets the certifiedApplicationsOnly property value. The certifiedApplicationsOnly property
     * @param value Value to set for the certifiedApplicationsOnly property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertifiedApplicationsOnly(@javax.annotation.Nullable final Boolean value) {
        this.certifiedApplicationsOnly = value;
    }
}

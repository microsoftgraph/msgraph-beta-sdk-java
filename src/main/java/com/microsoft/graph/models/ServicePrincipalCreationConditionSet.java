package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class ServicePrincipalCreationConditionSet extends Entity implements Parsable {
    /** The applicationIds property */
    private java.util.List<String> _applicationIds;
    /** The applicationPublisherIds property */
    private java.util.List<String> _applicationPublisherIds;
    /** The applicationsFromVerifiedPublisherOnly property */
    private Boolean _applicationsFromVerifiedPublisherOnly;
    /** The applicationTenantIds property */
    private java.util.List<String> _applicationTenantIds;
    /** The certifiedApplicationsOnly property */
    private Boolean _certifiedApplicationsOnly;
    /**
     * Instantiates a new servicePrincipalCreationConditionSet and sets the default values.
     * @return a void
     */
    public ServicePrincipalCreationConditionSet() {
        super();
        this.setOdataType("#microsoft.graph.servicePrincipalCreationConditionSet");
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
        return this._applicationIds;
    }
    /**
     * Gets the applicationPublisherIds property value. The applicationPublisherIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApplicationPublisherIds() {
        return this._applicationPublisherIds;
    }
    /**
     * Gets the applicationsFromVerifiedPublisherOnly property value. The applicationsFromVerifiedPublisherOnly property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getApplicationsFromVerifiedPublisherOnly() {
        return this._applicationsFromVerifiedPublisherOnly;
    }
    /**
     * Gets the applicationTenantIds property value. The applicationTenantIds property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getApplicationTenantIds() {
        return this._applicationTenantIds;
    }
    /**
     * Gets the certifiedApplicationsOnly property value. The certifiedApplicationsOnly property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getCertifiedApplicationsOnly() {
        return this._certifiedApplicationsOnly;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ServicePrincipalCreationConditionSet currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("applicationIds", (n) -> { currentObject.setApplicationIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("applicationPublisherIds", (n) -> { currentObject.setApplicationPublisherIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("applicationsFromVerifiedPublisherOnly", (n) -> { currentObject.setApplicationsFromVerifiedPublisherOnly(n.getBooleanValue()); });
            this.put("applicationTenantIds", (n) -> { currentObject.setApplicationTenantIds(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("certifiedApplicationsOnly", (n) -> { currentObject.setCertifiedApplicationsOnly(n.getBooleanValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setApplicationIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._applicationIds = value;
    }
    /**
     * Sets the applicationPublisherIds property value. The applicationPublisherIds property
     * @param value Value to set for the applicationPublisherIds property.
     * @return a void
     */
    public void setApplicationPublisherIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._applicationPublisherIds = value;
    }
    /**
     * Sets the applicationsFromVerifiedPublisherOnly property value. The applicationsFromVerifiedPublisherOnly property
     * @param value Value to set for the applicationsFromVerifiedPublisherOnly property.
     * @return a void
     */
    public void setApplicationsFromVerifiedPublisherOnly(@javax.annotation.Nullable final Boolean value) {
        this._applicationsFromVerifiedPublisherOnly = value;
    }
    /**
     * Sets the applicationTenantIds property value. The applicationTenantIds property
     * @param value Value to set for the applicationTenantIds property.
     * @return a void
     */
    public void setApplicationTenantIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._applicationTenantIds = value;
    }
    /**
     * Sets the certifiedApplicationsOnly property value. The certifiedApplicationsOnly property
     * @param value Value to set for the certifiedApplicationsOnly property.
     * @return a void
     */
    public void setCertifiedApplicationsOnly(@javax.annotation.Nullable final Boolean value) {
        this._certifiedApplicationsOnly = value;
    }
}

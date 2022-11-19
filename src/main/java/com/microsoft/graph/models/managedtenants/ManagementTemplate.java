package com.microsoft.graph.models.managedtenants;

import com.microsoft.graph.models.ActionUrl;
import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class ManagementTemplate extends Entity implements Parsable {
    /** The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only. */
    private ManagementCategory _category;
    /** The createdByUserId property */
    private String _createdByUserId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The description for the management template. Optional. Read-only. */
    private String _description;
    /** The display name for the management template. Required. Read-only. */
    private String _displayName;
    /** The informationLinks property */
    private java.util.List<ActionUrl> _informationLinks;
    /** The lastActionByUserId property */
    private String _lastActionByUserId;
    /** The lastActionDateTime property */
    private OffsetDateTime _lastActionDateTime;
    /** The managementTemplateCollections property */
    private java.util.List<ManagementTemplateCollection> _managementTemplateCollections;
    /** The managementTemplateSteps property */
    private java.util.List<ManagementTemplateStep> _managementTemplateSteps;
    /** The collection of parameters used by the management template. Optional. Read-only. */
    private java.util.List<TemplateParameter> _parameters;
    /** The priority property */
    private Integer _priority;
    /** The provider property */
    private ManagementProvider _provider;
    /** The userImpact property */
    private String _userImpact;
    /** The version property */
    private Integer _version;
    /** The collection of workload actions associated with the management template. Optional. Read-only. */
    private java.util.List<WorkloadAction> _workloadActions;
    /**
     * Instantiates a new managementTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ManagementTemplate() {
        super();
        this.setOdataType("#microsoft.graph.managedTenants.managementTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a managementTemplate
     */
    @javax.annotation.Nonnull
    public static ManagementTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ManagementTemplate();
    }
    /**
     * Gets the category property value. The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.
     * @return a managementCategory
     */
    @javax.annotation.Nullable
    public ManagementCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the createdByUserId property value. The createdByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCreatedByUserId() {
        return this._createdByUserId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the description property value. The description for the management template. Optional. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the management template. Required. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ManagementTemplate currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(ManagementCategory.class)); });
        deserializerMap.put("createdByUserId", (n) -> { currentObject.setCreatedByUserId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("informationLinks", (n) -> { currentObject.setInformationLinks(n.getCollectionOfObjectValues(ActionUrl::createFromDiscriminatorValue)); });
        deserializerMap.put("lastActionByUserId", (n) -> { currentObject.setLastActionByUserId(n.getStringValue()); });
        deserializerMap.put("lastActionDateTime", (n) -> { currentObject.setLastActionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managementTemplateCollections", (n) -> { currentObject.setManagementTemplateCollections(n.getCollectionOfObjectValues(ManagementTemplateCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("managementTemplateSteps", (n) -> { currentObject.setManagementTemplateSteps(n.getCollectionOfObjectValues(ManagementTemplateStep::createFromDiscriminatorValue)); });
        deserializerMap.put("parameters", (n) -> { currentObject.setParameters(n.getCollectionOfObjectValues(TemplateParameter::createFromDiscriminatorValue)); });
        deserializerMap.put("priority", (n) -> { currentObject.setPriority(n.getIntegerValue()); });
        deserializerMap.put("provider", (n) -> { currentObject.setProvider(n.getEnumValue(ManagementProvider.class)); });
        deserializerMap.put("userImpact", (n) -> { currentObject.setUserImpact(n.getStringValue()); });
        deserializerMap.put("version", (n) -> { currentObject.setVersion(n.getIntegerValue()); });
        deserializerMap.put("workloadActions", (n) -> { currentObject.setWorkloadActions(n.getCollectionOfObjectValues(WorkloadAction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the informationLinks property value. The informationLinks property
     * @return a actionUrl
     */
    @javax.annotation.Nullable
    public java.util.List<ActionUrl> getInformationLinks() {
        return this._informationLinks;
    }
    /**
     * Gets the lastActionByUserId property value. The lastActionByUserId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLastActionByUserId() {
        return this._lastActionByUserId;
    }
    /**
     * Gets the lastActionDateTime property value. The lastActionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastActionDateTime() {
        return this._lastActionDateTime;
    }
    /**
     * Gets the managementTemplateCollections property value. The managementTemplateCollections property
     * @return a managementTemplateCollection
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateCollection> getManagementTemplateCollections() {
        return this._managementTemplateCollections;
    }
    /**
     * Gets the managementTemplateSteps property value. The managementTemplateSteps property
     * @return a managementTemplateStep
     */
    @javax.annotation.Nullable
    public java.util.List<ManagementTemplateStep> getManagementTemplateSteps() {
        return this._managementTemplateSteps;
    }
    /**
     * Gets the parameters property value. The collection of parameters used by the management template. Optional. Read-only.
     * @return a templateParameter
     */
    @javax.annotation.Nullable
    public java.util.List<TemplateParameter> getParameters() {
        return this._parameters;
    }
    /**
     * Gets the priority property value. The priority property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPriority() {
        return this._priority;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a managementProvider
     */
    @javax.annotation.Nullable
    public ManagementProvider getProvider() {
        return this._provider;
    }
    /**
     * Gets the userImpact property value. The userImpact property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getUserImpact() {
        return this._userImpact;
    }
    /**
     * Gets the version property value. The version property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVersion() {
        return this._version;
    }
    /**
     * Gets the workloadActions property value. The collection of workload actions associated with the management template. Optional. Read-only.
     * @return a workloadAction
     */
    @javax.annotation.Nullable
    public java.util.List<WorkloadAction> getWorkloadActions() {
        return this._workloadActions;
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
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("createdByUserId", this.getCreatedByUserId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("informationLinks", this.getInformationLinks());
        writer.writeStringValue("lastActionByUserId", this.getLastActionByUserId());
        writer.writeOffsetDateTimeValue("lastActionDateTime", this.getLastActionDateTime());
        writer.writeCollectionOfObjectValues("managementTemplateCollections", this.getManagementTemplateCollections());
        writer.writeCollectionOfObjectValues("managementTemplateSteps", this.getManagementTemplateSteps());
        writer.writeCollectionOfObjectValues("parameters", this.getParameters());
        writer.writeIntegerValue("priority", this.getPriority());
        writer.writeEnumValue("provider", this.getProvider());
        writer.writeStringValue("userImpact", this.getUserImpact());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeCollectionOfObjectValues("workloadActions", this.getWorkloadActions());
    }
    /**
     * Sets the category property value. The management category for the management template. Possible values are: custom, devices, identity, unknownFutureValue. Required. Read-only.
     * @param value Value to set for the category property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCategory(@javax.annotation.Nullable final ManagementCategory value) {
        this._category = value;
    }
    /**
     * Sets the createdByUserId property value. The createdByUserId property
     * @param value Value to set for the createdByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedByUserId(@javax.annotation.Nullable final String value) {
        this._createdByUserId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the description property value. The description for the management template. Optional. Read-only.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the management template. Required. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the informationLinks property value. The informationLinks property
     * @param value Value to set for the informationLinks property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInformationLinks(@javax.annotation.Nullable final java.util.List<ActionUrl> value) {
        this._informationLinks = value;
    }
    /**
     * Sets the lastActionByUserId property value. The lastActionByUserId property
     * @param value Value to set for the lastActionByUserId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionByUserId(@javax.annotation.Nullable final String value) {
        this._lastActionByUserId = value;
    }
    /**
     * Sets the lastActionDateTime property value. The lastActionDateTime property
     * @param value Value to set for the lastActionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastActionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastActionDateTime = value;
    }
    /**
     * Sets the managementTemplateCollections property value. The managementTemplateCollections property
     * @param value Value to set for the managementTemplateCollections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplateCollections(@javax.annotation.Nullable final java.util.List<ManagementTemplateCollection> value) {
        this._managementTemplateCollections = value;
    }
    /**
     * Sets the managementTemplateSteps property value. The managementTemplateSteps property
     * @param value Value to set for the managementTemplateSteps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementTemplateSteps(@javax.annotation.Nullable final java.util.List<ManagementTemplateStep> value) {
        this._managementTemplateSteps = value;
    }
    /**
     * Sets the parameters property value. The collection of parameters used by the management template. Optional. Read-only.
     * @param value Value to set for the parameters property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setParameters(@javax.annotation.Nullable final java.util.List<TemplateParameter> value) {
        this._parameters = value;
    }
    /**
     * Sets the priority property value. The priority property
     * @param value Value to set for the priority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPriority(@javax.annotation.Nullable final Integer value) {
        this._priority = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvider(@javax.annotation.Nullable final ManagementProvider value) {
        this._provider = value;
    }
    /**
     * Sets the userImpact property value. The userImpact property
     * @param value Value to set for the userImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserImpact(@javax.annotation.Nullable final String value) {
        this._userImpact = value;
    }
    /**
     * Sets the version property value. The version property
     * @param value Value to set for the version property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVersion(@javax.annotation.Nullable final Integer value) {
        this._version = value;
    }
    /**
     * Sets the workloadActions property value. The collection of workload actions associated with the management template. Optional. Read-only.
     * @param value Value to set for the workloadActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWorkloadActions(@javax.annotation.Nullable final java.util.List<WorkloadAction> value) {
        this._workloadActions = value;
    }
}

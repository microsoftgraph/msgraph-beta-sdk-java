package com.microsoft.graph.beta.models.externalconnectors;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ExternalConnection extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ExternalConnection} and sets the default values.
     */
    public ExternalConnection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExternalConnection}
     */
    @jakarta.annotation.Nonnull
    public static ExternalConnection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExternalConnection();
    }
    /**
     * Gets the activitySettings property value. Collects configurable settings related to activities involving connector content.
     * @return a {@link ActivitySettings}
     */
    @jakarta.annotation.Nullable
    public ActivitySettings getActivitySettings() {
        return this.backingStore.get("activitySettings");
    }
    /**
     * Gets the complianceSettings property value. The complianceSettings property
     * @return a {@link ComplianceSettings}
     */
    @jakarta.annotation.Nullable
    public ComplianceSettings getComplianceSettings() {
        return this.backingStore.get("complianceSettings");
    }
    /**
     * Gets the configuration property value. Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     * @return a {@link Configuration}
     */
    @jakarta.annotation.Nullable
    public Configuration getConfiguration() {
        return this.backingStore.get("configuration");
    }
    /**
     * Gets the connectorId property value. The Teams App ID. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getConnectorId() {
        return this.backingStore.get("connectorId");
    }
    /**
     * Gets the description property value. Description of the connection displayed in the Microsoft 365 admin center. Optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the enabledContentExperiences property value. The list of content experiences the connection will participate in. Possible values are search.
     * @return a {@link EnumSet<ContentExperienceType>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<ContentExperienceType> getEnabledContentExperiences() {
        return this.backingStore.get("enabledContentExperiences");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activitySettings", (n) -> { this.setActivitySettings(n.getObjectValue(ActivitySettings::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceSettings", (n) -> { this.setComplianceSettings(n.getObjectValue(ComplianceSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("configuration", (n) -> { this.setConfiguration(n.getObjectValue(Configuration::createFromDiscriminatorValue)); });
        deserializerMap.put("connectorId", (n) -> { this.setConnectorId(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("enabledContentExperiences", (n) -> { this.setEnabledContentExperiences(n.getEnumSetValue(ContentExperienceType::forValue)); });
        deserializerMap.put("groups", (n) -> { this.setGroups(n.getCollectionOfObjectValues(ExternalGroup::createFromDiscriminatorValue)); });
        deserializerMap.put("ingestedItemsCount", (n) -> { this.setIngestedItemsCount(n.getLongValue()); });
        deserializerMap.put("items", (n) -> { this.setItems(n.getCollectionOfObjectValues(ExternalItem::createFromDiscriminatorValue)); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("operations", (n) -> { this.setOperations(n.getCollectionOfObjectValues(ConnectionOperation::createFromDiscriminatorValue)); });
        deserializerMap.put("quota", (n) -> { this.setQuota(n.getObjectValue(ConnectionQuota::createFromDiscriminatorValue)); });
        deserializerMap.put("schema", (n) -> { this.setSchema(n.getObjectValue(Schema::createFromDiscriminatorValue)); });
        deserializerMap.put("searchSettings", (n) -> { this.setSearchSettings(n.getObjectValue(SearchSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(ConnectionState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the groups property value. The groups property
     * @return a {@link java.util.List<ExternalGroup>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalGroup> getGroups() {
        return this.backingStore.get("groups");
    }
    /**
     * Gets the ingestedItemsCount property value. The number of items ingested into a connection. This value is refreshed every 15 minutes. If the connection state is draft, then ingestedItemsCount will be null.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getIngestedItemsCount() {
        return this.backingStore.get("ingestedItemsCount");
    }
    /**
     * Gets the items property value. The items property
     * @return a {@link java.util.List<ExternalItem>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExternalItem> getItems() {
        return this.backingStore.get("items");
    }
    /**
     * Gets the name property value. The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.backingStore.get("name");
    }
    /**
     * Gets the operations property value. The operations property
     * @return a {@link java.util.List<ConnectionOperation>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConnectionOperation> getOperations() {
        return this.backingStore.get("operations");
    }
    /**
     * Gets the quota property value. The quota property
     * @return a {@link ConnectionQuota}
     */
    @jakarta.annotation.Nullable
    public ConnectionQuota getQuota() {
        return this.backingStore.get("quota");
    }
    /**
     * Gets the schema property value. The schema property
     * @return a {@link Schema}
     */
    @jakarta.annotation.Nullable
    public Schema getSchema() {
        return this.backingStore.get("schema");
    }
    /**
     * Gets the searchSettings property value. The settings configuring the search experience for content in this connection, such as the display templates for search results.
     * @return a {@link SearchSettings}
     */
    @jakarta.annotation.Nullable
    public SearchSettings getSearchSettings() {
        return this.backingStore.get("searchSettings");
    }
    /**
     * Gets the state property value. Indicates the current state of the connection. Possible values are draft, ready, obsolete, and limitExceeded. Required.
     * @return a {@link ConnectionState}
     */
    @jakarta.annotation.Nullable
    public ConnectionState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("activitySettings", this.getActivitySettings());
        writer.writeObjectValue("complianceSettings", this.getComplianceSettings());
        writer.writeObjectValue("configuration", this.getConfiguration());
        writer.writeStringValue("connectorId", this.getConnectorId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeEnumSetValue("enabledContentExperiences", this.getEnabledContentExperiences());
        writer.writeCollectionOfObjectValues("groups", this.getGroups());
        writer.writeLongValue("ingestedItemsCount", this.getIngestedItemsCount());
        writer.writeCollectionOfObjectValues("items", this.getItems());
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfObjectValues("operations", this.getOperations());
        writer.writeObjectValue("quota", this.getQuota());
        writer.writeObjectValue("schema", this.getSchema());
        writer.writeObjectValue("searchSettings", this.getSearchSettings());
    }
    /**
     * Sets the activitySettings property value. Collects configurable settings related to activities involving connector content.
     * @param value Value to set for the activitySettings property.
     */
    public void setActivitySettings(@jakarta.annotation.Nullable final ActivitySettings value) {
        this.backingStore.set("activitySettings", value);
    }
    /**
     * Sets the complianceSettings property value. The complianceSettings property
     * @param value Value to set for the complianceSettings property.
     */
    public void setComplianceSettings(@jakarta.annotation.Nullable final ComplianceSettings value) {
        this.backingStore.set("complianceSettings", value);
    }
    /**
     * Sets the configuration property value. Specifies additional application IDs that are allowed to manage the connection and to index content in the connection. Optional.
     * @param value Value to set for the configuration property.
     */
    public void setConfiguration(@jakarta.annotation.Nullable final Configuration value) {
        this.backingStore.set("configuration", value);
    }
    /**
     * Sets the connectorId property value. The Teams App ID. Optional.
     * @param value Value to set for the connectorId property.
     */
    public void setConnectorId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("connectorId", value);
    }
    /**
     * Sets the description property value. Description of the connection displayed in the Microsoft 365 admin center. Optional.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the enabledContentExperiences property value. The list of content experiences the connection will participate in. Possible values are search.
     * @param value Value to set for the enabledContentExperiences property.
     */
    public void setEnabledContentExperiences(@jakarta.annotation.Nullable final EnumSet<ContentExperienceType> value) {
        this.backingStore.set("enabledContentExperiences", value);
    }
    /**
     * Sets the groups property value. The groups property
     * @param value Value to set for the groups property.
     */
    public void setGroups(@jakarta.annotation.Nullable final java.util.List<ExternalGroup> value) {
        this.backingStore.set("groups", value);
    }
    /**
     * Sets the ingestedItemsCount property value. The number of items ingested into a connection. This value is refreshed every 15 minutes. If the connection state is draft, then ingestedItemsCount will be null.
     * @param value Value to set for the ingestedItemsCount property.
     */
    public void setIngestedItemsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("ingestedItemsCount", value);
    }
    /**
     * Sets the items property value. The items property
     * @param value Value to set for the items property.
     */
    public void setItems(@jakarta.annotation.Nullable final java.util.List<ExternalItem> value) {
        this.backingStore.set("items", value);
    }
    /**
     * Sets the name property value. The display name of the connection to be displayed in the Microsoft 365 admin center. Maximum length of 128 characters. Required.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("name", value);
    }
    /**
     * Sets the operations property value. The operations property
     * @param value Value to set for the operations property.
     */
    public void setOperations(@jakarta.annotation.Nullable final java.util.List<ConnectionOperation> value) {
        this.backingStore.set("operations", value);
    }
    /**
     * Sets the quota property value. The quota property
     * @param value Value to set for the quota property.
     */
    public void setQuota(@jakarta.annotation.Nullable final ConnectionQuota value) {
        this.backingStore.set("quota", value);
    }
    /**
     * Sets the schema property value. The schema property
     * @param value Value to set for the schema property.
     */
    public void setSchema(@jakarta.annotation.Nullable final Schema value) {
        this.backingStore.set("schema", value);
    }
    /**
     * Sets the searchSettings property value. The settings configuring the search experience for content in this connection, such as the display templates for search results.
     * @param value Value to set for the searchSettings property.
     */
    public void setSearchSettings(@jakarta.annotation.Nullable final SearchSettings value) {
        this.backingStore.set("searchSettings", value);
    }
    /**
     * Sets the state property value. Indicates the current state of the connection. Possible values are draft, ready, obsolete, and limitExceeded. Required.
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final ConnectionState value) {
        this.backingStore.set("state", value);
    }
}

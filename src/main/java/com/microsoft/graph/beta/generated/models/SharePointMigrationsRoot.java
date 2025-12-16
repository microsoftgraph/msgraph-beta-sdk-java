package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SharePointMigrationsRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SharePointMigrationsRoot} and sets the default values.
     */
    public SharePointMigrationsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SharePointMigrationsRoot}
     */
    @jakarta.annotation.Nonnull
    public static SharePointMigrationsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SharePointMigrationsRoot();
    }
    /**
     * Gets the crossOrganizationGroupMappings property value. Collection of group identity mappings for cross-organization migration.
     * @return a {@link java.util.List<SharePointGroupIdentityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointGroupIdentityMapping> getCrossOrganizationGroupMappings() {
        return this.backingStore.get("crossOrganizationGroupMappings");
    }
    /**
     * Gets the crossOrganizationMigrationTasks property value. A collection of sharePointMigrationTask resources that represent cross-organization migration tasks.
     * @return a {@link java.util.List<SharePointMigrationTask>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointMigrationTask> getCrossOrganizationMigrationTasks() {
        return this.backingStore.get("crossOrganizationMigrationTasks");
    }
    /**
     * Gets the crossOrganizationUserMappings property value. Collection of user identity mappings for cross-organization migration.
     * @return a {@link java.util.List<SharePointUserIdentityMapping>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SharePointUserIdentityMapping> getCrossOrganizationUserMappings() {
        return this.backingStore.get("crossOrganizationUserMappings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("crossOrganizationGroupMappings", (n) -> { this.setCrossOrganizationGroupMappings(n.getCollectionOfObjectValues(SharePointGroupIdentityMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("crossOrganizationMigrationTasks", (n) -> { this.setCrossOrganizationMigrationTasks(n.getCollectionOfObjectValues(SharePointMigrationTask::createFromDiscriminatorValue)); });
        deserializerMap.put("crossOrganizationUserMappings", (n) -> { this.setCrossOrganizationUserMappings(n.getCollectionOfObjectValues(SharePointUserIdentityMapping::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("crossOrganizationGroupMappings", this.getCrossOrganizationGroupMappings());
        writer.writeCollectionOfObjectValues("crossOrganizationMigrationTasks", this.getCrossOrganizationMigrationTasks());
        writer.writeCollectionOfObjectValues("crossOrganizationUserMappings", this.getCrossOrganizationUserMappings());
    }
    /**
     * Sets the crossOrganizationGroupMappings property value. Collection of group identity mappings for cross-organization migration.
     * @param value Value to set for the crossOrganizationGroupMappings property.
     */
    public void setCrossOrganizationGroupMappings(@jakarta.annotation.Nullable final java.util.List<SharePointGroupIdentityMapping> value) {
        this.backingStore.set("crossOrganizationGroupMappings", value);
    }
    /**
     * Sets the crossOrganizationMigrationTasks property value. A collection of sharePointMigrationTask resources that represent cross-organization migration tasks.
     * @param value Value to set for the crossOrganizationMigrationTasks property.
     */
    public void setCrossOrganizationMigrationTasks(@jakarta.annotation.Nullable final java.util.List<SharePointMigrationTask> value) {
        this.backingStore.set("crossOrganizationMigrationTasks", value);
    }
    /**
     * Sets the crossOrganizationUserMappings property value. Collection of user identity mappings for cross-organization migration.
     * @param value Value to set for the crossOrganizationUserMappings property.
     */
    public void setCrossOrganizationUserMappings(@jakarta.annotation.Nullable final java.util.List<SharePointUserIdentityMapping> value) {
        this.backingStore.set("crossOrganizationUserMappings", value);
    }
}

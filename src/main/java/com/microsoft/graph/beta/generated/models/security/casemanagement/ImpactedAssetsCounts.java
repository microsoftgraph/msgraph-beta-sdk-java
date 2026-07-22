package com.microsoft.graph.beta.models.security.casemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ImpactedAssetsCounts implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ImpactedAssetsCounts} and sets the default values.
     */
    public ImpactedAssetsCounts() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ImpactedAssetsCounts}
     */
    @jakarta.annotation.Nonnull
    public static ImpactedAssetsCounts createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ImpactedAssetsCounts();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the aiAgents property value. The number of impacted AI agents.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getAiAgents() {
        return this.backingStore.get("aiAgents");
    }
    /**
     * Gets the apps property value. The number of impacted apps.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getApps() {
        return this.backingStore.get("apps");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the cloudResources property value. The number of impacted cloud resources.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCloudResources() {
        return this.backingStore.get("cloudResources");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(15);
        deserializerMap.put("aiAgents", (n) -> { this.setAiAgents(n.getIntegerValue()); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getIntegerValue()); });
        deserializerMap.put("cloudResources", (n) -> { this.setCloudResources(n.getIntegerValue()); });
        deserializerMap.put("files", (n) -> { this.setFiles(n.getIntegerValue()); });
        deserializerMap.put("ips", (n) -> { this.setIps(n.getIntegerValue()); });
        deserializerMap.put("machines", (n) -> { this.setMachines(n.getIntegerValue()); });
        deserializerMap.put("mailboxes", (n) -> { this.setMailboxes(n.getIntegerValue()); });
        deserializerMap.put("oauthApps", (n) -> { this.setOauthApps(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("processes", (n) -> { this.setProcesses(n.getIntegerValue()); });
        deserializerMap.put("registryKeys", (n) -> { this.setRegistryKeys(n.getIntegerValue()); });
        deserializerMap.put("securityGroups", (n) -> { this.setSecurityGroups(n.getIntegerValue()); });
        deserializerMap.put("total", (n) -> { this.setTotal(n.getIntegerValue()); });
        deserializerMap.put("urls", (n) -> { this.setUrls(n.getIntegerValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the files property value. The number of impacted files.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFiles() {
        return this.backingStore.get("files");
    }
    /**
     * Gets the ips property value. The number of impacted IP addresses.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIps() {
        return this.backingStore.get("ips");
    }
    /**
     * Gets the machines property value. The number of impacted machines.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMachines() {
        return this.backingStore.get("machines");
    }
    /**
     * Gets the mailboxes property value. The number of impacted mailboxes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMailboxes() {
        return this.backingStore.get("mailboxes");
    }
    /**
     * Gets the oauthApps property value. The number of impacted OAuth apps.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getOauthApps() {
        return this.backingStore.get("oauthApps");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the processes property value. The number of impacted processes.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getProcesses() {
        return this.backingStore.get("processes");
    }
    /**
     * Gets the registryKeys property value. The number of impacted registry keys.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getRegistryKeys() {
        return this.backingStore.get("registryKeys");
    }
    /**
     * Gets the securityGroups property value. The number of impacted security groups.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getSecurityGroups() {
        return this.backingStore.get("securityGroups");
    }
    /**
     * Gets the total property value. The total number of impacted assets.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotal() {
        return this.backingStore.get("total");
    }
    /**
     * Gets the urls property value. The number of impacted URLs.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUrls() {
        return this.backingStore.get("urls");
    }
    /**
     * Gets the users property value. The number of impacted users.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("aiAgents", this.getAiAgents());
        writer.writeIntegerValue("apps", this.getApps());
        writer.writeIntegerValue("cloudResources", this.getCloudResources());
        writer.writeIntegerValue("files", this.getFiles());
        writer.writeIntegerValue("ips", this.getIps());
        writer.writeIntegerValue("machines", this.getMachines());
        writer.writeIntegerValue("mailboxes", this.getMailboxes());
        writer.writeIntegerValue("oauthApps", this.getOauthApps());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("processes", this.getProcesses());
        writer.writeIntegerValue("registryKeys", this.getRegistryKeys());
        writer.writeIntegerValue("securityGroups", this.getSecurityGroups());
        writer.writeIntegerValue("total", this.getTotal());
        writer.writeIntegerValue("urls", this.getUrls());
        writer.writeIntegerValue("users", this.getUsers());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the aiAgents property value. The number of impacted AI agents.
     * @param value Value to set for the aiAgents property.
     */
    public void setAiAgents(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("aiAgents", value);
    }
    /**
     * Sets the apps property value. The number of impacted apps.
     * @param value Value to set for the apps property.
     */
    public void setApps(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("apps", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the cloudResources property value. The number of impacted cloud resources.
     * @param value Value to set for the cloudResources property.
     */
    public void setCloudResources(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cloudResources", value);
    }
    /**
     * Sets the files property value. The number of impacted files.
     * @param value Value to set for the files property.
     */
    public void setFiles(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("files", value);
    }
    /**
     * Sets the ips property value. The number of impacted IP addresses.
     * @param value Value to set for the ips property.
     */
    public void setIps(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("ips", value);
    }
    /**
     * Sets the machines property value. The number of impacted machines.
     * @param value Value to set for the machines property.
     */
    public void setMachines(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("machines", value);
    }
    /**
     * Sets the mailboxes property value. The number of impacted mailboxes.
     * @param value Value to set for the mailboxes property.
     */
    public void setMailboxes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("mailboxes", value);
    }
    /**
     * Sets the oauthApps property value. The number of impacted OAuth apps.
     * @param value Value to set for the oauthApps property.
     */
    public void setOauthApps(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("oauthApps", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the processes property value. The number of impacted processes.
     * @param value Value to set for the processes property.
     */
    public void setProcesses(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("processes", value);
    }
    /**
     * Sets the registryKeys property value. The number of impacted registry keys.
     * @param value Value to set for the registryKeys property.
     */
    public void setRegistryKeys(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("registryKeys", value);
    }
    /**
     * Sets the securityGroups property value. The number of impacted security groups.
     * @param value Value to set for the securityGroups property.
     */
    public void setSecurityGroups(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("securityGroups", value);
    }
    /**
     * Sets the total property value. The total number of impacted assets.
     * @param value Value to set for the total property.
     */
    public void setTotal(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("total", value);
    }
    /**
     * Sets the urls property value. The number of impacted URLs.
     * @param value Value to set for the urls property.
     */
    public void setUrls(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("urls", value);
    }
    /**
     * Sets the users property value. The number of impacted users.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("users", value);
    }
}

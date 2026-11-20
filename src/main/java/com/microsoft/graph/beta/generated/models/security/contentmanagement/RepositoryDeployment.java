package com.microsoft.graph.beta.models.security.contentmanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Details of a fetched deployment run. Read-only.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RepositoryDeployment implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link RepositoryDeployment} and sets the default values.
     */
    public RepositoryDeployment() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RepositoryDeployment}
     */
    @jakarta.annotation.Nonnull
    public static RepositoryDeployment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RepositoryDeployment();
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
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the deploymentDateTime property value. When the deployment ran.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeploymentDateTime() {
        return this.backingStore.get("deploymentDateTime");
    }
    /**
     * Gets the deploymentId property value. Deployment id.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeploymentId() {
        return this.backingStore.get("deploymentId");
    }
    /**
     * Gets the deploymentLogsUrl property value. URL where the deployment logs can be viewed.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDeploymentLogsUrl() {
        return this.backingStore.get("deploymentLogsUrl");
    }
    /**
     * Gets the deploymentResult property value. Result of a completed deployment.
     * @return a {@link RepositoryDeploymentResult}
     */
    @jakarta.annotation.Nullable
    public RepositoryDeploymentResult getDeploymentResult() {
        return this.backingStore.get("deploymentResult");
    }
    /**
     * Gets the deploymentState property value. State of a deployment run.
     * @return a {@link RepositoryDeploymentState}
     */
    @jakarta.annotation.Nullable
    public RepositoryDeploymentState getDeploymentState() {
        return this.backingStore.get("deploymentState");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("deploymentDateTime", (n) -> { this.setDeploymentDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentId", (n) -> { this.setDeploymentId(n.getStringValue()); });
        deserializerMap.put("deploymentLogsUrl", (n) -> { this.setDeploymentLogsUrl(n.getStringValue()); });
        deserializerMap.put("deploymentResult", (n) -> { this.setDeploymentResult(n.getEnumValue(RepositoryDeploymentResult::forValue)); });
        deserializerMap.put("deploymentState", (n) -> { this.setDeploymentState(n.getEnumValue(RepositoryDeploymentState::forValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("deploymentResult", this.getDeploymentResult());
        writer.writeEnumValue("deploymentState", this.getDeploymentState());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the deploymentDateTime property value. When the deployment ran.
     * @param value Value to set for the deploymentDateTime property.
     */
    public void setDeploymentDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("deploymentDateTime", value);
    }
    /**
     * Sets the deploymentId property value. Deployment id.
     * @param value Value to set for the deploymentId property.
     */
    public void setDeploymentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deploymentId", value);
    }
    /**
     * Sets the deploymentLogsUrl property value. URL where the deployment logs can be viewed.
     * @param value Value to set for the deploymentLogsUrl property.
     */
    public void setDeploymentLogsUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deploymentLogsUrl", value);
    }
    /**
     * Sets the deploymentResult property value. Result of a completed deployment.
     * @param value Value to set for the deploymentResult property.
     */
    public void setDeploymentResult(@jakarta.annotation.Nullable final RepositoryDeploymentResult value) {
        this.backingStore.set("deploymentResult", value);
    }
    /**
     * Sets the deploymentState property value. State of a deployment run.
     * @param value Value to set for the deploymentState property.
     */
    public void setDeploymentState(@jakarta.annotation.Nullable final RepositoryDeploymentState value) {
        this.backingStore.set("deploymentState", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
}

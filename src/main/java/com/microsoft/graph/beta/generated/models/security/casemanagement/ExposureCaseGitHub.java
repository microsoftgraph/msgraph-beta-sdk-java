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
public class ExposureCaseGitHub implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link ExposureCaseGitHub} and sets the default values.
     */
    public ExposureCaseGitHub() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ExposureCaseGitHub}
     */
    @jakarta.annotation.Nonnull
    public static ExposureCaseGitHub createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ExposureCaseGitHub();
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
     * Gets the environmentId property value. The environmentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEnvironmentId() {
        return this.backingStore.get("environmentId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("environmentId", (n) -> { this.setEnvironmentId(n.getStringValue()); });
        deserializerMap.put("issueNumber", (n) -> { this.setIssueNumber(n.getIntegerValue()); });
        deserializerMap.put("issueUrl", (n) -> { this.setIssueUrl(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("primaryAssessmentId", (n) -> { this.setPrimaryAssessmentId(n.getStringValue()); });
        deserializerMap.put("repoName", (n) -> { this.setRepoName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the issueNumber property value. The issueNumber property
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getIssueNumber() {
        return this.backingStore.get("issueNumber");
    }
    /**
     * Gets the issueUrl property value. The issueUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIssueUrl() {
        return this.backingStore.get("issueUrl");
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
     * Gets the primaryAssessmentId property value. The primaryAssessmentId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPrimaryAssessmentId() {
        return this.backingStore.get("primaryAssessmentId");
    }
    /**
     * Gets the repoName property value. The repoName property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRepoName() {
        return this.backingStore.get("repoName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("environmentId", this.getEnvironmentId());
        writer.writeIntegerValue("issueNumber", this.getIssueNumber());
        writer.writeStringValue("issueUrl", this.getIssueUrl());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("primaryAssessmentId", this.getPrimaryAssessmentId());
        writer.writeStringValue("repoName", this.getRepoName());
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
     * Sets the environmentId property value. The environmentId property
     * @param value Value to set for the environmentId property.
     */
    public void setEnvironmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("environmentId", value);
    }
    /**
     * Sets the issueNumber property value. The issueNumber property
     * @param value Value to set for the issueNumber property.
     */
    public void setIssueNumber(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("issueNumber", value);
    }
    /**
     * Sets the issueUrl property value. The issueUrl property
     * @param value Value to set for the issueUrl property.
     */
    public void setIssueUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("issueUrl", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the primaryAssessmentId property value. The primaryAssessmentId property
     * @param value Value to set for the primaryAssessmentId property.
     */
    public void setPrimaryAssessmentId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("primaryAssessmentId", value);
    }
    /**
     * Sets the repoName property value. The repoName property
     * @param value Value to set for the repoName property.
     */
    public void setRepoName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("repoName", value);
    }
}

package com.microsoft.graph.devicemanagement.manageddevices.item.wipe;

import com.microsoft.graph.models.ObliterationBehavior;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WipePostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The keepEnrollmentData property
     */
    private Boolean keepEnrollmentData;
    /**
     * The keepUserData property
     */
    private Boolean keepUserData;
    /**
     * The macOsUnlockCode property
     */
    private String macOsUnlockCode;
    /**
     * The obliterationBehavior property
     */
    private ObliterationBehavior obliterationBehavior;
    /**
     * The persistEsimDataPlan property
     */
    private Boolean persistEsimDataPlan;
    /**
     * The useProtectedWipe property
     */
    private Boolean useProtectedWipe;
    /**
     * Instantiates a new wipePostRequestBody and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WipePostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a wipePostRequestBody
     */
    @javax.annotation.Nonnull
    public static WipePostRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WipePostRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("keepEnrollmentData", (n) -> { this.setKeepEnrollmentData(n.getBooleanValue()); });
        deserializerMap.put("keepUserData", (n) -> { this.setKeepUserData(n.getBooleanValue()); });
        deserializerMap.put("macOsUnlockCode", (n) -> { this.setMacOsUnlockCode(n.getStringValue()); });
        deserializerMap.put("obliterationBehavior", (n) -> { this.setObliterationBehavior(n.getEnumValue(ObliterationBehavior.class)); });
        deserializerMap.put("persistEsimDataPlan", (n) -> { this.setPersistEsimDataPlan(n.getBooleanValue()); });
        deserializerMap.put("useProtectedWipe", (n) -> { this.setUseProtectedWipe(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the keepEnrollmentData property value. The keepEnrollmentData property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeepEnrollmentData() {
        return this.keepEnrollmentData;
    }
    /**
     * Gets the keepUserData property value. The keepUserData property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getKeepUserData() {
        return this.keepUserData;
    }
    /**
     * Gets the macOsUnlockCode property value. The macOsUnlockCode property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMacOsUnlockCode() {
        return this.macOsUnlockCode;
    }
    /**
     * Gets the obliterationBehavior property value. The obliterationBehavior property
     * @return a obliterationBehavior
     */
    @javax.annotation.Nullable
    public ObliterationBehavior getObliterationBehavior() {
        return this.obliterationBehavior;
    }
    /**
     * Gets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPersistEsimDataPlan() {
        return this.persistEsimDataPlan;
    }
    /**
     * Gets the useProtectedWipe property value. The useProtectedWipe property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseProtectedWipe() {
        return this.useProtectedWipe;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("keepEnrollmentData", this.getKeepEnrollmentData());
        writer.writeBooleanValue("keepUserData", this.getKeepUserData());
        writer.writeStringValue("macOsUnlockCode", this.getMacOsUnlockCode());
        writer.writeEnumValue("obliterationBehavior", this.getObliterationBehavior());
        writer.writeBooleanValue("persistEsimDataPlan", this.getPersistEsimDataPlan());
        writer.writeBooleanValue("useProtectedWipe", this.getUseProtectedWipe());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the keepEnrollmentData property value. The keepEnrollmentData property
     * @param value Value to set for the keepEnrollmentData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeepEnrollmentData(@javax.annotation.Nullable final Boolean value) {
        this.keepEnrollmentData = value;
    }
    /**
     * Sets the keepUserData property value. The keepUserData property
     * @param value Value to set for the keepUserData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKeepUserData(@javax.annotation.Nullable final Boolean value) {
        this.keepUserData = value;
    }
    /**
     * Sets the macOsUnlockCode property value. The macOsUnlockCode property
     * @param value Value to set for the macOsUnlockCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMacOsUnlockCode(@javax.annotation.Nullable final String value) {
        this.macOsUnlockCode = value;
    }
    /**
     * Sets the obliterationBehavior property value. The obliterationBehavior property
     * @param value Value to set for the obliterationBehavior property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setObliterationBehavior(@javax.annotation.Nullable final ObliterationBehavior value) {
        this.obliterationBehavior = value;
    }
    /**
     * Sets the persistEsimDataPlan property value. The persistEsimDataPlan property
     * @param value Value to set for the persistEsimDataPlan property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPersistEsimDataPlan(@javax.annotation.Nullable final Boolean value) {
        this.persistEsimDataPlan = value;
    }
    /**
     * Sets the useProtectedWipe property value. The useProtectedWipe property
     * @param value Value to set for the useProtectedWipe property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseProtectedWipe(@javax.annotation.Nullable final Boolean value) {
        this.useProtectedWipe = value;
    }
}

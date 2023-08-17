package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Admin consent information.
 */
public class AdminConsent implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Admin consent state.
     */
    private AdminConsentState shareAPNSData;
    /**
     * Admin consent state.
     */
    private AdminConsentState shareUserExperienceAnalyticsData;
    /**
     * Instantiates a new adminConsent and sets the default values.
     */
    public AdminConsent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a adminConsent
     */
    @jakarta.annotation.Nonnull
    public static AdminConsent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AdminConsent();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("shareAPNSData", (n) -> { this.setShareAPNSData(n.getEnumValue(AdminConsentState.class)); });
        deserializerMap.put("shareUserExperienceAnalyticsData", (n) -> { this.setShareUserExperienceAnalyticsData(n.getEnumValue(AdminConsentState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the shareAPNSData property value. Admin consent state.
     * @return a adminConsentState
     */
    @jakarta.annotation.Nullable
    public AdminConsentState getShareAPNSData() {
        return this.shareAPNSData;
    }
    /**
     * Gets the shareUserExperienceAnalyticsData property value. Admin consent state.
     * @return a adminConsentState
     */
    @jakarta.annotation.Nullable
    public AdminConsentState getShareUserExperienceAnalyticsData() {
        return this.shareUserExperienceAnalyticsData;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("shareAPNSData", this.getShareAPNSData());
        writer.writeEnumValue("shareUserExperienceAnalyticsData", this.getShareUserExperienceAnalyticsData());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the shareAPNSData property value. Admin consent state.
     * @param value Value to set for the shareAPNSData property.
     */
    public void setShareAPNSData(@jakarta.annotation.Nullable final AdminConsentState value) {
        this.shareAPNSData = value;
    }
    /**
     * Sets the shareUserExperienceAnalyticsData property value. Admin consent state.
     * @param value Value to set for the shareUserExperienceAnalyticsData property.
     */
    public void setShareUserExperienceAnalyticsData(@jakarta.annotation.Nullable final AdminConsentState value) {
        this.shareUserExperienceAnalyticsData = value;
    }
}

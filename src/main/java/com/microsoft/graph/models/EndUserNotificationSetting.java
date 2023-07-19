package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EndUserNotificationSetting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The notificationPreference property
     */
    private EndUserNotificationPreference notificationPreference;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The positiveReinforcement property
     */
    private PositiveReinforcementNotification positiveReinforcement;
    /**
     * The settingType property
     */
    private EndUserNotificationSettingType settingType;
    /**
     * Instantiates a new endUserNotificationSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EndUserNotificationSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a endUserNotificationSetting
     */
    @javax.annotation.Nonnull
    public static EndUserNotificationSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.noTrainingNotificationSetting": return new NoTrainingNotificationSetting();
                case "#microsoft.graph.trainingNotificationSetting": return new TrainingNotificationSetting();
            }
        }
        return new EndUserNotificationSetting();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("notificationPreference", (n) -> { this.setNotificationPreference(n.getEnumValue(EndUserNotificationPreference.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("positiveReinforcement", (n) -> { this.setPositiveReinforcement(n.getObjectValue(PositiveReinforcementNotification::createFromDiscriminatorValue)); });
        deserializerMap.put("settingType", (n) -> { this.setSettingType(n.getEnumValue(EndUserNotificationSettingType.class)); });
        return deserializerMap;
    }
    /**
     * Gets the notificationPreference property value. The notificationPreference property
     * @return a endUserNotificationPreference
     */
    @javax.annotation.Nullable
    public EndUserNotificationPreference getNotificationPreference() {
        return this.notificationPreference;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the positiveReinforcement property value. The positiveReinforcement property
     * @return a positiveReinforcementNotification
     */
    @javax.annotation.Nullable
    public PositiveReinforcementNotification getPositiveReinforcement() {
        return this.positiveReinforcement;
    }
    /**
     * Gets the settingType property value. The settingType property
     * @return a endUserNotificationSettingType
     */
    @javax.annotation.Nullable
    public EndUserNotificationSettingType getSettingType() {
        return this.settingType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("notificationPreference", this.getNotificationPreference());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("positiveReinforcement", this.getPositiveReinforcement());
        writer.writeEnumValue("settingType", this.getSettingType());
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
     * Sets the notificationPreference property value. The notificationPreference property
     * @param value Value to set for the notificationPreference property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationPreference(@javax.annotation.Nullable final EndUserNotificationPreference value) {
        this.notificationPreference = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the positiveReinforcement property value. The positiveReinforcement property
     * @param value Value to set for the positiveReinforcement property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPositiveReinforcement(@javax.annotation.Nullable final PositiveReinforcementNotification value) {
        this.positiveReinforcement = value;
    }
    /**
     * Sets the settingType property value. The settingType property
     * @param value Value to set for the settingType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettingType(@javax.annotation.Nullable final EndUserNotificationSettingType value) {
        this.settingType = value;
    }
}

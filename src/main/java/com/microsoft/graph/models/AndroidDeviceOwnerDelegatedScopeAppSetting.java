package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Represents one item in the list of managed apps with app details and its associated delegated scope(s).
 */
public class AndroidDeviceOwnerDelegatedScopeAppSetting implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Represents an app in the list of managed applications
     */
    private AppListItem appDetail;
    /**
     * List of scopes an app has been assigned.
     */
    private java.util.List<AndroidDeviceOwnerDelegatedAppScopeType> appScopes;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new androidDeviceOwnerDelegatedScopeAppSetting and sets the default values.
     */
    public AndroidDeviceOwnerDelegatedScopeAppSetting() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a androidDeviceOwnerDelegatedScopeAppSetting
     */
    @jakarta.annotation.Nonnull
    public static AndroidDeviceOwnerDelegatedScopeAppSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AndroidDeviceOwnerDelegatedScopeAppSetting();
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
     * Gets the appDetail property value. Represents an app in the list of managed applications
     * @return a appListItem
     */
    @jakarta.annotation.Nullable
    public AppListItem getAppDetail() {
        return this.appDetail;
    }
    /**
     * Gets the appScopes property value. List of scopes an app has been assigned.
     * @return a androidDeviceOwnerDelegatedAppScopeType
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidDeviceOwnerDelegatedAppScopeType> getAppScopes() {
        return this.appScopes;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("appDetail", (n) -> { this.setAppDetail(n.getObjectValue(AppListItem::createFromDiscriminatorValue)); });
        deserializerMap.put("appScopes", (n) -> { this.setAppScopes(n.getCollectionOfEnumValues(AndroidDeviceOwnerDelegatedAppScopeType.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("appDetail", this.getAppDetail());
        writer.writeCollectionOfEnumValues("appScopes", this.getAppScopes());
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the appDetail property value. Represents an app in the list of managed applications
     * @param value Value to set for the appDetail property.
     */
    public void setAppDetail(@jakarta.annotation.Nullable final AppListItem value) {
        this.appDetail = value;
    }
    /**
     * Sets the appScopes property value. List of scopes an app has been assigned.
     * @param value Value to set for the appScopes property.
     */
    public void setAppScopes(@jakarta.annotation.Nullable final java.util.List<AndroidDeviceOwnerDelegatedAppScopeType> value) {
        this.appScopes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

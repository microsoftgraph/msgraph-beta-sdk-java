package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Represents per-process privacy preferences. */
public class MacOSPrivacyAccessControlItem implements AdditionalDataHolder, Parsable {
    /** Possible values of a property */
    private Enablement _accessibility;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Possible values of a property */
    private Enablement _addressBook;
    /** Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements. */
    private java.util.List<MacOSAppleEventReceiver> _appleEventsAllowedReceivers;
    /** Block access to camera app. */
    private Boolean _blockCamera;
    /** Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later. */
    private Boolean _blockListenEvent;
    /** Block access to microphone. */
    private Boolean _blockMicrophone;
    /** Block app from capturing contents of system display. Requires macOS 10.15 or later. */
    private Boolean _blockScreenCapture;
    /** Possible values of a property */
    private Enablement _calendar;
    /** Enter the code requirement, which can be obtained with the command 'codesign –display -r –' in the Terminal app. Include everything after '=>'. */
    private String _codeRequirement;
    /** The display name of the app, process, or executable. */
    private String _displayName;
    /** Possible values of a property */
    private Enablement _fileProviderPresence;
    /** The bundle ID or path of the app, process, or executable. */
    private String _identifier;
    /** Process identifier types for MacOS Privacy Preferences */
    private MacOSProcessIdentifierType _identifierType;
    /** Possible values of a property */
    private Enablement _mediaLibrary;
    /** The OdataType property */
    private String _odataType;
    /** Possible values of a property */
    private Enablement _photos;
    /** Possible values of a property */
    private Enablement _postEvent;
    /** Possible values of a property */
    private Enablement _reminders;
    /** Possible values of a property */
    private Enablement _speechRecognition;
    /** Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature. */
    private Boolean _staticCodeValidation;
    /** Possible values of a property */
    private Enablement _systemPolicyAllFiles;
    /** Possible values of a property */
    private Enablement _systemPolicyDesktopFolder;
    /** Possible values of a property */
    private Enablement _systemPolicyDocumentsFolder;
    /** Possible values of a property */
    private Enablement _systemPolicyDownloadsFolder;
    /** Possible values of a property */
    private Enablement _systemPolicyNetworkVolumes;
    /** Possible values of a property */
    private Enablement _systemPolicyRemovableVolumes;
    /** Possible values of a property */
    private Enablement _systemPolicySystemAdminFiles;
    /**
     * Instantiates a new macOSPrivacyAccessControlItem and sets the default values.
     * @return a void
     */
    public MacOSPrivacyAccessControlItem() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.macOSPrivacyAccessControlItem");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a macOSPrivacyAccessControlItem
     */
    @javax.annotation.Nonnull
    public static MacOSPrivacyAccessControlItem createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOSPrivacyAccessControlItem();
    }
    /**
     * Gets the accessibility property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAccessibility() {
        return this._accessibility;
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the addressBook property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getAddressBook() {
        return this._addressBook;
    }
    /**
     * Gets the appleEventsAllowedReceivers property value. Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.
     * @return a macOSAppleEventReceiver
     */
    @javax.annotation.Nullable
    public java.util.List<MacOSAppleEventReceiver> getAppleEventsAllowedReceivers() {
        return this._appleEventsAllowedReceivers;
    }
    /**
     * Gets the blockCamera property value. Block access to camera app.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockCamera() {
        return this._blockCamera;
    }
    /**
     * Gets the blockListenEvent property value. Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockListenEvent() {
        return this._blockListenEvent;
    }
    /**
     * Gets the blockMicrophone property value. Block access to microphone.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockMicrophone() {
        return this._blockMicrophone;
    }
    /**
     * Gets the blockScreenCapture property value. Block app from capturing contents of system display. Requires macOS 10.15 or later.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getBlockScreenCapture() {
        return this._blockScreenCapture;
    }
    /**
     * Gets the calendar property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getCalendar() {
        return this._calendar;
    }
    /**
     * Gets the codeRequirement property value. Enter the code requirement, which can be obtained with the command 'codesign –display -r –' in the Terminal app. Include everything after '=>'.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCodeRequirement() {
        return this._codeRequirement;
    }
    /**
     * Gets the displayName property value. The display name of the app, process, or executable.
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
        final MacOSPrivacyAccessControlItem currentObject = this;
        return new HashMap<>(27) {{
            this.put("accessibility", (n) -> { currentObject.setAccessibility(n.getEnumValue(Enablement.class)); });
            this.put("addressBook", (n) -> { currentObject.setAddressBook(n.getEnumValue(Enablement.class)); });
            this.put("appleEventsAllowedReceivers", (n) -> { currentObject.setAppleEventsAllowedReceivers(n.getCollectionOfObjectValues(MacOSAppleEventReceiver::createFromDiscriminatorValue)); });
            this.put("blockCamera", (n) -> { currentObject.setBlockCamera(n.getBooleanValue()); });
            this.put("blockListenEvent", (n) -> { currentObject.setBlockListenEvent(n.getBooleanValue()); });
            this.put("blockMicrophone", (n) -> { currentObject.setBlockMicrophone(n.getBooleanValue()); });
            this.put("blockScreenCapture", (n) -> { currentObject.setBlockScreenCapture(n.getBooleanValue()); });
            this.put("calendar", (n) -> { currentObject.setCalendar(n.getEnumValue(Enablement.class)); });
            this.put("codeRequirement", (n) -> { currentObject.setCodeRequirement(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("fileProviderPresence", (n) -> { currentObject.setFileProviderPresence(n.getEnumValue(Enablement.class)); });
            this.put("identifier", (n) -> { currentObject.setIdentifier(n.getStringValue()); });
            this.put("identifierType", (n) -> { currentObject.setIdentifierType(n.getEnumValue(MacOSProcessIdentifierType.class)); });
            this.put("mediaLibrary", (n) -> { currentObject.setMediaLibrary(n.getEnumValue(Enablement.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("photos", (n) -> { currentObject.setPhotos(n.getEnumValue(Enablement.class)); });
            this.put("postEvent", (n) -> { currentObject.setPostEvent(n.getEnumValue(Enablement.class)); });
            this.put("reminders", (n) -> { currentObject.setReminders(n.getEnumValue(Enablement.class)); });
            this.put("speechRecognition", (n) -> { currentObject.setSpeechRecognition(n.getEnumValue(Enablement.class)); });
            this.put("staticCodeValidation", (n) -> { currentObject.setStaticCodeValidation(n.getBooleanValue()); });
            this.put("systemPolicyAllFiles", (n) -> { currentObject.setSystemPolicyAllFiles(n.getEnumValue(Enablement.class)); });
            this.put("systemPolicyDesktopFolder", (n) -> { currentObject.setSystemPolicyDesktopFolder(n.getEnumValue(Enablement.class)); });
            this.put("systemPolicyDocumentsFolder", (n) -> { currentObject.setSystemPolicyDocumentsFolder(n.getEnumValue(Enablement.class)); });
            this.put("systemPolicyDownloadsFolder", (n) -> { currentObject.setSystemPolicyDownloadsFolder(n.getEnumValue(Enablement.class)); });
            this.put("systemPolicyNetworkVolumes", (n) -> { currentObject.setSystemPolicyNetworkVolumes(n.getEnumValue(Enablement.class)); });
            this.put("systemPolicyRemovableVolumes", (n) -> { currentObject.setSystemPolicyRemovableVolumes(n.getEnumValue(Enablement.class)); });
            this.put("systemPolicySystemAdminFiles", (n) -> { currentObject.setSystemPolicySystemAdminFiles(n.getEnumValue(Enablement.class)); });
        }};
    }
    /**
     * Gets the fileProviderPresence property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getFileProviderPresence() {
        return this._fileProviderPresence;
    }
    /**
     * Gets the identifier property value. The bundle ID or path of the app, process, or executable.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getIdentifier() {
        return this._identifier;
    }
    /**
     * Gets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @return a macOSProcessIdentifierType
     */
    @javax.annotation.Nullable
    public MacOSProcessIdentifierType getIdentifierType() {
        return this._identifierType;
    }
    /**
     * Gets the mediaLibrary property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getMediaLibrary() {
        return this._mediaLibrary;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the photos property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getPhotos() {
        return this._photos;
    }
    /**
     * Gets the postEvent property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getPostEvent() {
        return this._postEvent;
    }
    /**
     * Gets the reminders property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getReminders() {
        return this._reminders;
    }
    /**
     * Gets the speechRecognition property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSpeechRecognition() {
        return this._speechRecognition;
    }
    /**
     * Gets the staticCodeValidation property value. Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getStaticCodeValidation() {
        return this._staticCodeValidation;
    }
    /**
     * Gets the systemPolicyAllFiles property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSystemPolicyAllFiles() {
        return this._systemPolicyAllFiles;
    }
    /**
     * Gets the systemPolicyDesktopFolder property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSystemPolicyDesktopFolder() {
        return this._systemPolicyDesktopFolder;
    }
    /**
     * Gets the systemPolicyDocumentsFolder property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSystemPolicyDocumentsFolder() {
        return this._systemPolicyDocumentsFolder;
    }
    /**
     * Gets the systemPolicyDownloadsFolder property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSystemPolicyDownloadsFolder() {
        return this._systemPolicyDownloadsFolder;
    }
    /**
     * Gets the systemPolicyNetworkVolumes property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSystemPolicyNetworkVolumes() {
        return this._systemPolicyNetworkVolumes;
    }
    /**
     * Gets the systemPolicyRemovableVolumes property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSystemPolicyRemovableVolumes() {
        return this._systemPolicyRemovableVolumes;
    }
    /**
     * Gets the systemPolicySystemAdminFiles property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getSystemPolicySystemAdminFiles() {
        return this._systemPolicySystemAdminFiles;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessibility", this.getAccessibility());
        writer.writeEnumValue("addressBook", this.getAddressBook());
        writer.writeCollectionOfObjectValues("appleEventsAllowedReceivers", this.getAppleEventsAllowedReceivers());
        writer.writeBooleanValue("blockCamera", this.getBlockCamera());
        writer.writeBooleanValue("blockListenEvent", this.getBlockListenEvent());
        writer.writeBooleanValue("blockMicrophone", this.getBlockMicrophone());
        writer.writeBooleanValue("blockScreenCapture", this.getBlockScreenCapture());
        writer.writeEnumValue("calendar", this.getCalendar());
        writer.writeStringValue("codeRequirement", this.getCodeRequirement());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("fileProviderPresence", this.getFileProviderPresence());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeEnumValue("identifierType", this.getIdentifierType());
        writer.writeEnumValue("mediaLibrary", this.getMediaLibrary());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("photos", this.getPhotos());
        writer.writeEnumValue("postEvent", this.getPostEvent());
        writer.writeEnumValue("reminders", this.getReminders());
        writer.writeEnumValue("speechRecognition", this.getSpeechRecognition());
        writer.writeBooleanValue("staticCodeValidation", this.getStaticCodeValidation());
        writer.writeEnumValue("systemPolicyAllFiles", this.getSystemPolicyAllFiles());
        writer.writeEnumValue("systemPolicyDesktopFolder", this.getSystemPolicyDesktopFolder());
        writer.writeEnumValue("systemPolicyDocumentsFolder", this.getSystemPolicyDocumentsFolder());
        writer.writeEnumValue("systemPolicyDownloadsFolder", this.getSystemPolicyDownloadsFolder());
        writer.writeEnumValue("systemPolicyNetworkVolumes", this.getSystemPolicyNetworkVolumes());
        writer.writeEnumValue("systemPolicyRemovableVolumes", this.getSystemPolicyRemovableVolumes());
        writer.writeEnumValue("systemPolicySystemAdminFiles", this.getSystemPolicySystemAdminFiles());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessibility property value. Possible values of a property
     * @param value Value to set for the accessibility property.
     * @return a void
     */
    public void setAccessibility(@javax.annotation.Nullable final Enablement value) {
        this._accessibility = value;
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the addressBook property value. Possible values of a property
     * @param value Value to set for the addressBook property.
     * @return a void
     */
    public void setAddressBook(@javax.annotation.Nullable final Enablement value) {
        this._addressBook = value;
    }
    /**
     * Sets the appleEventsAllowedReceivers property value. Allow or deny the app or process to send a restricted Apple event to another app or process. You will need to know the identifier, identifier type, and code requirement of the receiving app or process. This collection can contain a maximum of 500 elements.
     * @param value Value to set for the appleEventsAllowedReceivers property.
     * @return a void
     */
    public void setAppleEventsAllowedReceivers(@javax.annotation.Nullable final java.util.List<MacOSAppleEventReceiver> value) {
        this._appleEventsAllowedReceivers = value;
    }
    /**
     * Sets the blockCamera property value. Block access to camera app.
     * @param value Value to set for the blockCamera property.
     * @return a void
     */
    public void setBlockCamera(@javax.annotation.Nullable final Boolean value) {
        this._blockCamera = value;
    }
    /**
     * Sets the blockListenEvent property value. Block the app or process from listening to events from input devices such as mouse, keyboard, and trackpad.Requires macOS 10.15 or later.
     * @param value Value to set for the blockListenEvent property.
     * @return a void
     */
    public void setBlockListenEvent(@javax.annotation.Nullable final Boolean value) {
        this._blockListenEvent = value;
    }
    /**
     * Sets the blockMicrophone property value. Block access to microphone.
     * @param value Value to set for the blockMicrophone property.
     * @return a void
     */
    public void setBlockMicrophone(@javax.annotation.Nullable final Boolean value) {
        this._blockMicrophone = value;
    }
    /**
     * Sets the blockScreenCapture property value. Block app from capturing contents of system display. Requires macOS 10.15 or later.
     * @param value Value to set for the blockScreenCapture property.
     * @return a void
     */
    public void setBlockScreenCapture(@javax.annotation.Nullable final Boolean value) {
        this._blockScreenCapture = value;
    }
    /**
     * Sets the calendar property value. Possible values of a property
     * @param value Value to set for the calendar property.
     * @return a void
     */
    public void setCalendar(@javax.annotation.Nullable final Enablement value) {
        this._calendar = value;
    }
    /**
     * Sets the codeRequirement property value. Enter the code requirement, which can be obtained with the command 'codesign –display -r –' in the Terminal app. Include everything after '=>'.
     * @param value Value to set for the codeRequirement property.
     * @return a void
     */
    public void setCodeRequirement(@javax.annotation.Nullable final String value) {
        this._codeRequirement = value;
    }
    /**
     * Sets the displayName property value. The display name of the app, process, or executable.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the fileProviderPresence property value. Possible values of a property
     * @param value Value to set for the fileProviderPresence property.
     * @return a void
     */
    public void setFileProviderPresence(@javax.annotation.Nullable final Enablement value) {
        this._fileProviderPresence = value;
    }
    /**
     * Sets the identifier property value. The bundle ID or path of the app, process, or executable.
     * @param value Value to set for the identifier property.
     * @return a void
     */
    public void setIdentifier(@javax.annotation.Nullable final String value) {
        this._identifier = value;
    }
    /**
     * Sets the identifierType property value. Process identifier types for MacOS Privacy Preferences
     * @param value Value to set for the identifierType property.
     * @return a void
     */
    public void setIdentifierType(@javax.annotation.Nullable final MacOSProcessIdentifierType value) {
        this._identifierType = value;
    }
    /**
     * Sets the mediaLibrary property value. Possible values of a property
     * @param value Value to set for the mediaLibrary property.
     * @return a void
     */
    public void setMediaLibrary(@javax.annotation.Nullable final Enablement value) {
        this._mediaLibrary = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the photos property value. Possible values of a property
     * @param value Value to set for the photos property.
     * @return a void
     */
    public void setPhotos(@javax.annotation.Nullable final Enablement value) {
        this._photos = value;
    }
    /**
     * Sets the postEvent property value. Possible values of a property
     * @param value Value to set for the postEvent property.
     * @return a void
     */
    public void setPostEvent(@javax.annotation.Nullable final Enablement value) {
        this._postEvent = value;
    }
    /**
     * Sets the reminders property value. Possible values of a property
     * @param value Value to set for the reminders property.
     * @return a void
     */
    public void setReminders(@javax.annotation.Nullable final Enablement value) {
        this._reminders = value;
    }
    /**
     * Sets the speechRecognition property value. Possible values of a property
     * @param value Value to set for the speechRecognition property.
     * @return a void
     */
    public void setSpeechRecognition(@javax.annotation.Nullable final Enablement value) {
        this._speechRecognition = value;
    }
    /**
     * Sets the staticCodeValidation property value. Statically validates the code requirement. Use this setting if the process invalidates its dynamic code signature.
     * @param value Value to set for the staticCodeValidation property.
     * @return a void
     */
    public void setStaticCodeValidation(@javax.annotation.Nullable final Boolean value) {
        this._staticCodeValidation = value;
    }
    /**
     * Sets the systemPolicyAllFiles property value. Possible values of a property
     * @param value Value to set for the systemPolicyAllFiles property.
     * @return a void
     */
    public void setSystemPolicyAllFiles(@javax.annotation.Nullable final Enablement value) {
        this._systemPolicyAllFiles = value;
    }
    /**
     * Sets the systemPolicyDesktopFolder property value. Possible values of a property
     * @param value Value to set for the systemPolicyDesktopFolder property.
     * @return a void
     */
    public void setSystemPolicyDesktopFolder(@javax.annotation.Nullable final Enablement value) {
        this._systemPolicyDesktopFolder = value;
    }
    /**
     * Sets the systemPolicyDocumentsFolder property value. Possible values of a property
     * @param value Value to set for the systemPolicyDocumentsFolder property.
     * @return a void
     */
    public void setSystemPolicyDocumentsFolder(@javax.annotation.Nullable final Enablement value) {
        this._systemPolicyDocumentsFolder = value;
    }
    /**
     * Sets the systemPolicyDownloadsFolder property value. Possible values of a property
     * @param value Value to set for the systemPolicyDownloadsFolder property.
     * @return a void
     */
    public void setSystemPolicyDownloadsFolder(@javax.annotation.Nullable final Enablement value) {
        this._systemPolicyDownloadsFolder = value;
    }
    /**
     * Sets the systemPolicyNetworkVolumes property value. Possible values of a property
     * @param value Value to set for the systemPolicyNetworkVolumes property.
     * @return a void
     */
    public void setSystemPolicyNetworkVolumes(@javax.annotation.Nullable final Enablement value) {
        this._systemPolicyNetworkVolumes = value;
    }
    /**
     * Sets the systemPolicyRemovableVolumes property value. Possible values of a property
     * @param value Value to set for the systemPolicyRemovableVolumes property.
     * @return a void
     */
    public void setSystemPolicyRemovableVolumes(@javax.annotation.Nullable final Enablement value) {
        this._systemPolicyRemovableVolumes = value;
    }
    /**
     * Sets the systemPolicySystemAdminFiles property value. Possible values of a property
     * @param value Value to set for the systemPolicySystemAdminFiles property.
     * @return a void
     */
    public void setSystemPolicySystemAdminFiles(@javax.annotation.Nullable final Enablement value) {
        this._systemPolicySystemAdminFiles = value;
    }
}
